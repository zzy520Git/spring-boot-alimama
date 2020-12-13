package console.tools;

import reactor.core.publisher.Flux;

/**
 * Description:
 *
 * @author zhouzhongyi
 * @date 2020/12/13
 */
public class FluxDemo {
    public static void main(String[] args) {
        print();
    }

    public static void print() {
        Flux<Integer> range = Flux.range(1, 10);
        range.subscribe(System.out::println);
    }


}
