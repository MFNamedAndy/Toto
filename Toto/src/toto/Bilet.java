/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package toto;

/**
 *
 * @author andreyyak
 */
public class Bilet {
    private String code;
    private int[] myNumbers;
    private int[] winningNumbers;
    
    public String getCode() {
        return code;
    }
    public void setCode(String code) throws IllegalArgumentException {
        if (code == null) {
            throw new IllegalArgumentException("`code` was null.");
        }
        this.code = code;
    }

    public int[] getMyNumbers() {
        return myNumbers;
    }
    public void setMyNumbers(int[] myNumbers) throws IllegalArgumentException {
        if (myNumbers == null) {
            throw new IllegalArgumentException("`myNumbers` was null.");
        }
        this.myNumbers = myNumbers;
    }
    
    public int[] getWinningNumbers() {
        return winningNumbers;
    }
    public void setWinningNumbers(int[] winningNumbers) throws IllegalArgumentException {
        if (winningNumbers == null) {
            throw new IllegalArgumentException("`winningNumbers` was null.");
        }
        this.winningNumbers = winningNumbers;
    }
    
    public Bilet() {
        setCode("no code");
        int[] myNumbers = { 0, 1, 2, 3, 4, 5 };
        int[] winningNumbers = { 0, 1, 2, 3, 4, 5 };
        setMyNumbers(myNumbers);
        setWinningNumbers(winningNumbers);
    }
    public Bilet(String code, int[] myNumbers, int[] winningNumbers) {
        setCode(code);
        setMyNumbers(myNumbers);
        setWinningNumbers(winningNumbers);
    }
    
    // TODO: copy constructor i toString()
}
