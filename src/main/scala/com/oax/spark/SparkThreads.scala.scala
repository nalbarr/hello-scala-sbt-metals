package com.oax.spark

// NA
// - https://stackoverflow.com/questions/42860835/sparkcontext-setlocalproperties
// TODO: port to Scala

/*
public class App {
    private static JavaSparkContext sc;
    public static void main(String[] args) {
        SparkConf conf = new SparkConf().setMaster("local")
                .setAppName("Testing App");
        sc = new JavaSparkContext(conf);
        SparkThread Thread1 = new SparkThread(1);
        SparkThread Thread2 = new SparkThread(2);
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Future ThreadCompletion1 = executor.submit(Thread1);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        Future ThreadCompletion2 = executor.submit(Thread2);
        try {
            ThreadCompletion1.get();
            ThreadCompletion2.get();
        } catch (InterruptedException | ExecutionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    private static class SparkThread implements Runnable{
        private int i = 1;
        public  SparkThread(int i) {
            this.i = i;

        }
        @Override
        public void run() {
            int mem = 512;
            sc.setLocalProperty("spark.executor.memory", Integer.toString(mem * i));
            JavaRDD<String> input = sc.textFile("test" + i);

            FlatMapFunction<String, String> tt = s -> Arrays.asList(s.split(" "))
                    .iterator();
            JavaRDD<String> words = input.flatMap(tt);
            System.out.println("Thread " + i + " Before sleeping mem: " + sc.getLocalProperty("spark.executor.memory"));

            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            //do some work
            JavaPairRDD<String, Integer> counts = words.mapToPair(t -> new Tuple2(t, 1))
                    .reduceByKey((x, y) -> (int) x + (int) y);

            counts.saveAsTextFile("output" + i);
            System.out.println("Thread " + i + " After sleeping mem: " + sc.getLocalProperty("spark.executor.memory"));
        }

    }
}

 */
object SparkThreads {
  def main(args: Array[String]) {
    println("TODO: port to Scala.")
  }
}