package console.tools;

import reactor.core.publisher.Flux;

import java.time.Duration;

/**
 * Description:
 *
 * @author zhouzhongyi
 * @date 2020/12/13
 */
public class FluxDemo {
    public static void main(String[] args) {
//        print();
        takeTimes();
//        takeCondition();
    }

    public static void print() {
        Flux<Integer> range = Flux.range(1, 10);
        range.subscribe(System.out::println);
    }

    public static void takeNum() {
        Flux<Integer> range = Flux.range(1, 10).take(5);
        range.subscribe(System.out::println);
    }

    public static void takeTimes() {
        Flux<Integer> range = Flux.range(1, 1000)
                .take(Duration.ofMillis(1));
        range.subscribe(System.out::println);
    }

    public static void takeCondition() {
        Flux<Integer> range = Flux.range(1, 1000)
                .takeUntil(o -> o >= 10);
        range.subscribe(System.out::println);
    }


}
