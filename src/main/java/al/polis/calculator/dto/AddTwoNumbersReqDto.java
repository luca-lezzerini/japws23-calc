package al.polis.calculator.dto;

import lombok.Data;


@Data
public class AddTwoNumbersReqDto {

    private double number1;
    private double number2;

    public void setOperator(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
