package com.crazykid.junior;

public class MultiplicationTable {
    public String getTable(int factor) {
        if (factor > 0) {
            return getTableWhenFactorIsPosition(factor);
        } else {
            throw new IllegalArgumentException("The factor must be positive.");
        }
    }

    private String getTableWhenFactorIsPosition(int factor) {
        StringBuilder multiplicationTable = new StringBuilder();
        for (int i = 1; i <= factor; i++) {
            buildLine(multiplicationTable, i);
            deleteSpaceAndCommaOfTheEndOfLine(multiplicationTable);
            appendTheEnter(multiplicationTable);
        }
        deleteTheLastEnter(multiplicationTable);
        return multiplicationTable.toString();
    }

    private void buildLine(StringBuilder multiplicationTable, int i) {
        for (int j = 1; j <= i; j++) {
            multiplicationTable
                    .append(i)
                    .append("*")
                    .append(j)
                    .append(" = ")
                    .append(i * j)
                    .append(", ");
        }
    }

    private void deleteSpaceAndCommaOfTheEndOfLine(StringBuilder multiplicationTable) {
        deleteTheLastComma(multiplicationTable);
        deleteTheLastEnter(multiplicationTable);
    }

    private void deleteTheLastComma(StringBuilder multiplicationTable) {
        multiplicationTable.deleteCharAt(multiplicationTable.length() - 2);
    }

    private void deleteTheLastEnter(StringBuilder multiplicationTable) {
        multiplicationTable.deleteCharAt(multiplicationTable.length() - 1);
    }

    private void appendTheEnter(StringBuilder multiplicationTable) {
        multiplicationTable.append("\n");
    }
}
