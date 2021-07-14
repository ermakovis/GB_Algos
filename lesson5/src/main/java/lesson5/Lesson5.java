package lesson5;

import java.util.ArrayList;
import java.util.List;

public class Lesson5 {
    public static double power(int base, int power) {
        if (power == 0) return 1;
        if (power < 0) return 1 / power(base, power * -1);
        return base * power(base, power - 1);
    }

    public static List<Pair> bagProblem(final List<Pair> items, final Double limit) {
        return bagProblem(items, limit, new ArrayList<>());
    }

    private static List<Pair> bagProblem(final List<Pair> items, final Double limit, final List<Pair> solution) {
        if (items.isEmpty()) return solution;

        Pair currentItem = items.get(items.size() - 1);
        Double currentSum = listWeightSum(solution);
        List<Pair> filteredList = new ArrayList<>(items){{remove(currentItem);}};

        if (currentSum.equals(limit)) return solution;
        if (currentSum + currentItem.getWeight() > limit) {
            return bagProblem(new ArrayList<>(filteredList), limit, new ArrayList<>(solution));
        }

        List<Pair> excludedResult = bagProblem(filteredList, limit, new ArrayList<>(solution));
        List<Pair> includedResult = bagProblem(filteredList, limit,
                new ArrayList<>(solution){{add(currentItem);}});
        return listValueSum(excludedResult) > listValueSum(includedResult) ? excludedResult : includedResult;
    }

    private static Double listWeightSum(List<Pair> doubleList) {
        return doubleList.stream().mapToDouble(Pair::getWeight).sum();
    }

    private static Double listValueSum(List<Pair> doubleList) {
        return doubleList.stream().mapToDouble(Pair::getValue).sum();
    }
}
