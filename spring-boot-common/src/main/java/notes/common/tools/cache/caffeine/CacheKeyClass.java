package notes.common.tools.cache.caffeine;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.Objects;

/**
 * Description:
 *
 * @author zhouzhongyi
 * @date 2020/12/25
 */
@Getter
@Setter
@Accessors(chain = true)
public class CacheKeyClass implements CacheKey {
    private String group;

    private String dataId;

    @Override
    public int hashCode() {
        return Objects.hash(group, dataId);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof CacheKeyClass) {
            CacheKeyClass co = (CacheKeyClass)obj;
            return Objects.equals(co.getGroup(), group)
                    && Objects.equals(co.getDataId(), dataId);
        }
        return false;
    }
}
