package ua.edu.kibit;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


    public class MyTrigonometricFunction {
        public static void main(String[] args) {
            double start = 0;        // Початок діапазону
            double end = 2 * Math.PI; // Кінець діапазону
            double step = 0.1;        // Крок
            int numThreads = 4;       // Кількість потоків

            ExecutorService executor = Executors.newFixedThreadPool(numThreads);
            List<Future<Result>> futures = new ArrayList<>();

            for (double x = start; x <= end; x += step) {
                double currentX = x;
                Callable<Result> task = () -> {
                    double y = Math.sin(currentX);
                    return new Result(currentX, y);
                };
                futures.add(executor.submit(task));
            }

            executor.shutdown();

            try {
                for (Future<Result> future : futures) {
                    Result result = future.get();
                    System.out.printf("x = %.2f, y = %.2f%n", result.x, result.y);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    class Result {
        double x;
        double y;

        public Result(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }

