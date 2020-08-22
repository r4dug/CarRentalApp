package ro.jademy.carrental.util;

import org.apache.commons.lang3.StringUtils;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class InputUtils {

    /**
     * Parse a list of input items and return a list of integers.
     * <p>
     * Ex:
     * <p>
     * Given string: 1, 2, a,b,c, 3,    7,    9,
     * <p>
     * Result: [1, 2, 3, 7, 9]
     *
     * @param input List of integers, separated by the given separator, in String form.
     * @return List of integers
     */
    public static List<Integer> parseStringInput(String input, String separator) {
        input = input.replace(" ", "");

        if (input.charAt(input.length() - 1) == ',') {
            input = input.substring(0, input.length() - 1);
        }

        String[] inputList = input.split(separator);

        List<Integer> integerInputList = new ArrayList<>();
        for (String s : inputList) {
            if (StringUtils.isNumeric(s))
                integerInputList.add(Integer.parseInt(s));
            
        }

        return integerInputList;
    }
    public static LocalDate formatDate(String date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate formattedDate = LocalDate.parse(date,formatter);
        return formattedDate;
    }

}
