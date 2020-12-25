package notes.common.tools.cache.caffeine;

/**
 * Description:
 *
 * @author zhouzhongyi
 * @date 2020/12/25
 */
public interface CacheKey {
    String getGroup();

    String getDataId();
}
