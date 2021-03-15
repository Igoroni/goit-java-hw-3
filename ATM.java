class ATM {
    public int countBanknotes(int sum) {
        int count = 0;
        int index = 0;
        int [] banknotes = {500, 200, 100, 50, 20, 10, 5, 2, 1};

        while (sum > 0) {
            int banknote = banknotes[index];
            index++;

            while (sum >= banknote) {
                sum -= banknote;
                count++;
            }
        }
        return  count;
    }
}
