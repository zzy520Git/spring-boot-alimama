package notes.common.tools.cache.caffeine;

import com.github.benmanes.caffeine.cache.Caffeine;
import com.github.benmanes.caffeine.cache.Expiry;
import com.github.benmanes.caffeine.cache.LoadingCache;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.PostConstruct;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;

/**
 * Description:
 *
 * @author zhouzhongyi
 * @date 2020/12/25
 */
@Slf4j
public class CaffeCache {
    public static final String NULL = "_null_";

    public static String get(CacheKey key) {
        String value = CAFFE_CACHE.get(key);
        return Objects.equals(value, NULL) ? null : value;
    }

    @PostConstruct
    private void init() {
        //@Component
    }

    private static final LoadingCache<CacheKey, String> CAFFE_CACHE =
            Caffeine.newBuilder()
                    .maximumSize(3)
                    .initialCapacity(1)
                    .expireAfter(new Expiry<CacheKey, String>() {
                        @Override
                        public long expireAfterCreate(CacheKey key, String value, long currentTime) {
                            if (Objects.equals(NULL, value)) {
                                //5min
                                return TimeUnit.MINUTES.toNanos(5);
                            }
                            if (key.getClass() != CacheKeyEnum.class) {
                                //1h
                                TimeUnit.HOURS.toNanos(1);
                            }
                            return Long.MAX_VALUE;
                        }

                        @Override
                        public long expireAfterUpdate(CacheKey key, String value, long currentTime, long currentDuration) {
                            return currentDuration;
                        }

                        @Override
                        public long expireAfterRead(CacheKey key, String value, long currentTime, long currentDuration) {
                            return currentDuration;
                        }
                    })
                    .build(url -> {
                        log.error("回源查缓存group=[{}],dataId=[{}]", url.getGroup(), url.getDataId());
                        if (Objects.equals(url.getGroup(), "test")) {
                            return NULL;
                        }
                        return "ddd:" + url.getGroup() + "-" + url.getDataId();
                    });
}
