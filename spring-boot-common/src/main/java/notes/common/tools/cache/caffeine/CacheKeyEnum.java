package notes.common.tools.cache.caffeine;

import lombok.Getter;

/**
 * Description:
 *
 * @author zhouzhongyi
 * @date 2020/12/25
 */
@Getter
public enum CacheKeyEnum implements CacheKey {
    A("fa", "yb"),
    B("fb", "yb"),
    C("fc", "yb"),
    D("fd", "yb"),
    E("fe", "yb"),
    F("ff", "yb"),
    TEST("test", "yb"),
    ;

    CacheKeyEnum(String a, String b) {
        this.group = a;
        this.dataId = b;
    }
    private String group;

    private String dataId;
}
