package ru.skypro.homework__2__testing.service;

import org.springframework.stereotype.Service;
import ru.skypro.homework__2__testing.exception.DivideException;
@Service
public class CalculatorServiceImpl implements CalculatorService{
    @Override
    public int sum(int num1, int num2) {
        return num1+num2;
    }

    @Override
    public int subtract(int num1, int num2) {
        return num1-num2;
    }

    @Override
    public int multiply(int num1, int num2) {
        return num1*num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if(num2==0){
        throw new DivideException();
        }
        return num1/num2;
    }
}
