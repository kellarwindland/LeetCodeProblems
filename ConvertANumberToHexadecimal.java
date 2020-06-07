// Given an integer, write an algorithm to convert it to hexadecimal. For negative integer, two’s complement method is used.

class Solution {
    public String toHex(int num) {
        
        
        HashMap<String, Character> map = new HashMap<String, Character>();
        map.put("0000", '0');
        map.put("0001", '1');
        map.put("0010", '2');
        map.put("0011", '3');
        map.put("0100", '4');
        map.put("0101", '5');
        map.put("0110", '6');
        map.put("0111", '7');
        map.put("1000", '8');
        map.put("1001", '9');
        map.put("1010", 'a');
        map.put("1011", 'b');
        map.put("1100", 'c');
        map.put("1101", 'd');
        map.put("1110", 'e');
        map.put("1111", 'f');
        
        
        String hex = "";
        if(num == 0){
            return "0";
        }
        
        if(num > 0){
            int temp = num;
            int rem;
            String bin = "";
            while(temp != 0){
                rem = temp % 2;
                bin = rem + bin;
                temp = temp / 2;
            }

            String tempStr = "";
            for(int i = bin.length() - 1; i >= 0; i--){
                tempStr = bin.charAt(i) + tempStr;
                if(tempStr.length() % 4 == 0 && tempStr.length() > 0){
                    hex = map.get(tempStr) + hex;
                    tempStr = "";
                }
            }

            if(tempStr.length() > 0){
                while(tempStr.length() != 4){
                    tempStr = '0' + tempStr;
                }
                hex = map.get(tempStr) + hex;
            }
            
        }else{
            
            int temp = num * -1;
            int rem;
            String bin = "";
            while(temp != 0){
                rem = temp % 2;
                if(rem < 0){
                    rem = rem * -1;
                }
                bin = rem + bin;
                temp = temp / 2;
                if(temp < 0){
                    temp = temp * -1;
                }
            }
            
            
            while(bin.length() != 32){
                bin = '0' + bin;
            }

            boolean check = false;
            String newBin = "";
            for(int j = bin.length() - 1; j >= 0; j--){
                char tempChar = bin.charAt(j);
                if(!check){
                    if(tempChar == '1'){
                        check = true;
                    }
                        newBin = tempChar + newBin;
                }else{
                    if(tempChar == '0'){
                        tempChar = '1';
                        newBin = tempChar + newBin;
                    }else{
                        tempChar = '0';
                        newBin = tempChar + newBin;
                    }
                }
            }
            String tempStr = "";
            for(int i = newBin.length() - 1; i >= 0; i--){
                tempStr = newBin.charAt(i) + tempStr;
                if(tempStr.length() % 4 == 0 && tempStr.length() > 0){
                    hex = map.get(tempStr) + hex;
                    tempStr = "";
                }
            }

            
         }
        
        return hex;
        
    }
}
