    import java.lang.instrument.Instrumentation;

    public class Product {
        String name;
        String location;
        double weight;

        Product(String name) {
            this.name = name;
            this.location = "shelf";
            this.weight = 1;
        }
        Product(String name, String location) {
            this.name = name;
            this.location = location;
            this.weight = 1;
        }
        Product(String name, double weight) {
            this.name = name;
            this.location = "shelf";
            this.weight = weight;
        }

        Product(String name, String location, double weight) {
            this.name = name;
            this.location = location;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return name + " (" + weight + " kg) can be found from the " + location;
        }

        public static void main(String[] args) {
            Product tapeMeasure = new Product("Tape measure");
            Product plaster = new Product("Plaster", "home improvement section");
            Product tyre = new Product("Tyre", 5);

            System.out.println(tapeMeasure);
            System.out.println(plaster);
            System.out.println(tyre);
        }

        public static class ObjectSizeFetcher {
            private static Instrumentation instrumentation;

            public static void premain(String args, Instrumentation inst) {
                instrumentation = inst;
            }

            public static long getObjectSize(Object o) {
                return instrumentation.getObjectSize(o);
            }

        }
    }
