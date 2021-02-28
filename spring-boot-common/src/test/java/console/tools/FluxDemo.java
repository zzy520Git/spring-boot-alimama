package console.tools;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Scheduler;
import reactor.core.scheduler.Schedulers;

import java.time.Duration;
import java.util.concurrent.CompletableFuture;

/**
 * Description:
 *
 * @author zhouzhongyi
 * @date 2020/12/13
 */
public class FluxDemo {
    public static void main(String[] args) {
        testZipWith();
        //        testFuture();
//        print();
//        takeTimes();
//        takeCondition();
    }

    public static void testZipWith() {
        Flux.just("a", "b")
                .zipWith(Flux.just("c", "d"))
                .subscribe(System.out::println);
    }

    public static void testFuture() {
        System.out.println(Thread.currentThread().getId() +
                Thread.currentThread().getName());
        CompletableFuture<Integer> fu = Mono.just(1).map(t -> {
            System.out.println(Thread.currentThread().getId() +
                    Thread.currentThread().getName());
            return t + 1;
        }).map(t -> {
            System.out.println(Thread.currentThread().getId() +
                    Thread.currentThread().getName());
            return t + 3;
        }).subscribeOn(Schedulers.elastic()).toFuture();
        System.out.println(fu.join());
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
