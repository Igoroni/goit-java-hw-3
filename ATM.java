public class ATM {
    public int countBanknotes(int sum) {
        int[] values = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        
        int result = 0;
        
        int currentValueIndex = 0;
        
        while (sum > 0) {
            int currentValue = values[currentValueIndex];
            currentValueIndex++;
            
            while (sum >= currentValue) {
                result++;
                sum -= currentValue;
            }
            
        }
        
        return result;
    }
}
