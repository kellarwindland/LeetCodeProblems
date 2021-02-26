// Given a date string in the form Day Month Year, where:
// Day is in the set {"1st", "2nd", "3rd", "4th", ..., "30th", "31st"}.
// Month is in the set {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}.
// Year is in the range [1900, 2100].
// Convert the date string to the format YYYY-MM-DD, where:
// YYYY denotes the 4 digit year.
// MM denotes the 2 digit month.
// DD denotes the 2 digit day.

class Solution {
    public String reformatDate(String date) {
        String[] temp = date.split(" ");
        String result = temp[2] + "-";
        
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        for(int i = 0; i < months.length; i++){
            if(temp[1].equals(months[i])){
                if((i + 1) < 10){
                    result += "0" + (i + 1) + "-";
                }else{
                    result += (i + 1) + "-";
                }
                break;
            }
        }
        
        int day = Integer.valueOf(temp[0].substring(0, temp[0].length() - 2));
        
        if(day < 10){
            result += "0" + temp[0].substring(0, temp[0].length() - 2);
        }else{
            result += temp[0].substring(0, temp[0].length() - 2);
        }
        
        return result;
    }
}
