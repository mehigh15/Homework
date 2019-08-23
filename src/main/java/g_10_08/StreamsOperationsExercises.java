package g_10_08;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class StreamsOperationsExercises {

    static Trader raoul = new Trader("Raoul", "Cambridge");
    static Trader mario = new Trader("Mario", "Milan");
    static Trader alan = new Trader("Alan", "Cambridge");
    static Trader brian = new Trader("Brian", "Cambridge");

    static List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300),
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950));

    /**
     * Find all transactions in the year 2011 and sort them by value (small to high).
     * What are all the unique cities where the traders work?
     * Find all traders from Cambridge and sort them by name.
     * Return a string of all traders’ names sorted alphabetically.
     * Are any traders based in Milan?
     * Print all transactions’ values from the traders living in Cambridge.
     * What’s the highest value of all the transactions?
     * Find the transaction with the smallest value.
     */
    public static void main(String[] args) {
        System.out.println(findAllTransactionsInYear(2011));
        System.out.println(findCities());
        System.out.println(findTradersFromCambridge());
        System.out.println(sortTradersNamesAlphabetically());
        System.out.println(findTradersBasedInMilan());
        printTransactionValues("Cambridge");
        System.out.println(showHighestValue());
        System.out.println(showLowestValue());

    }


    private static List<Transaction> findAllTransactionsInYear(int year) {
        return transactions.stream()
                .filter(transaction -> transaction.getYear() == year)
                .sorted(comparing(Transaction::getValue))
                .collect(toList());
    }

    private static List<String> findCities() {
        return transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .collect(toList());
    }

    private static List<Trader> findTradersFromCambridge() {
        return transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .distinct()
                .sorted(comparing(Trader::getName))
                .collect(toList());
    }

    private static String sortTradersNamesAlphabetically() {
        return transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .reduce(" ", (a, b) -> a + " " + b);
    }

    private static boolean findTradersBasedInMilan() {
        return transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
    }

    private static void printTransactionValues(String city) {
        transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals(city))
                .map(Transaction::getValue)
                .forEach(x -> System.out.println(x + ","));
    }

    private static int showHighestValue() {
        return transactions.stream()
                .map(Transaction::getValue)
                .reduce(0, Integer::max);
    }

    private static int showLowestValue() {
        return transactions.stream()
                .map(Transaction::getValue)
                .min(Comparator.comparing(Integer::valueOf))
                .get();
    }


}
