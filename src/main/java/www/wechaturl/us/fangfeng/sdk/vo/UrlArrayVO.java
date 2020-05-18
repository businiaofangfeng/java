package www.wechaturl.us.fangfeng.sdk.vo;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class UrlArrayVO<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    int count;
    List<T> list;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UrlArrayVO)) return false;
        UrlArrayVO<?> that = (UrlArrayVO<?>) o;
        return getCount() == that.getCount() &&
                Objects.equals(getList(), that.getList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCount(), getList());
    }
}
