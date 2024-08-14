

public class Main {
    public static void main(String[] args) {
        Counter ageCounter = new Counter(17);
        ageCounter.increaseCount();
        boolean isAllowedIn = AgeVerifier.isOver18(ageCounter.getCount());
        System.out.println(isAllowedIn);

    }
}