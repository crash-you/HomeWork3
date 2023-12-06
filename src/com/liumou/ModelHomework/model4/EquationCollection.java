package com.liumou.ModelHomework.model4;

import java.util.*;

public class EquationCollection implements Iterable {

    private final Set<IEqualtion> equations = new HashSet<>();

    public void generate(int n, EquationChecker checker) {
        EquationFactory factory = new EquationFactory();
        Random random = new Random();

        while (equations.size() < n) {
            IEqualtion equation = factory.getEquationRandom();
            if (checker.check(equation) && equations.add(equation)){
                continue;
            }
        }
    }

    @Override
    public Iterator<IEqualtion> iterator() {
        return equations.iterator();
    }
}
