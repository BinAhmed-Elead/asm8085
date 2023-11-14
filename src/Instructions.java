import java.util.HashMap;
import java.util.HexFormat;

public class Instructions {
    static HashMap<String, String> mnemonics1B = new HashMap<>(); //<Mnemonics,Hex>
    static HashMap<String, String> mnemonics2B = new HashMap<>(); //<Mnemonics,Hex>
    static HashMap<String, String> mnemonics3B = new HashMap<>(); //<Mnemonics,Hex>

    static {
        //-----------------------OneByte-----------------------//
        mnemonics1B.put("NOP", "00");
        mnemonics1B.put("STAX B", "02");
        mnemonics1B.put("INX B", "03");
        mnemonics1B.put("INR B", "04");
        mnemonics1B.put("DCR B", "05");
        mnemonics1B.put("RLC", "07");
        mnemonics1B.put("DAD B", "09");
        mnemonics1B.put("LDAX B", "0A");
        mnemonics1B.put("DCX B", "0B");
        mnemonics1B.put("INR C", "0C");
        mnemonics1B.put("DCR C", "0D");
        mnemonics1B.put("RRC C", "0F");

        mnemonics1B.put("STAX D", "12");
        mnemonics1B.put("INX D", "13");
        mnemonics1B.put("INR D", "14");
        mnemonics1B.put("DCR D", "15");
        mnemonics1B.put("RAL", "17");
        mnemonics1B.put("DAD D", "19");
        mnemonics1B.put("LDAX D", "1A");
        mnemonics1B.put("DCX D", "1B");
        mnemonics1B.put("INR E", "1C");
        mnemonics1B.put("DCR E", "1D");
        mnemonics1B.put("RAR", "1F");
        mnemonics1B.put("RIM", "20");

        mnemonics1B.put("INX H", "23");
        mnemonics1B.put("INR H", "24");
        mnemonics1B.put("DCR H", "25");
        mnemonics1B.put("DAA", "27");
        mnemonics1B.put("DAD H", "29");
        mnemonics1B.put("DCX H", "2B");
        mnemonics1B.put("INR L", "2C");
        mnemonics1B.put("DCR L", "2D");
        mnemonics1B.put("CMA", "2F");
        mnemonics1B.put("SIM", "30");

        mnemonics1B.put("INX SP", "33");
        mnemonics1B.put("INR M", "34");
        mnemonics1B.put("DCR M", "35");
        mnemonics1B.put("STC", "37");
        mnemonics1B.put("DAD SP", "39");
        mnemonics1B.put("DCX SP", "3B");
        mnemonics1B.put("INR A", "3C");
        mnemonics1B.put("DCR A", "3D");
        mnemonics1B.put("CMC", "3F");

        mnemonics1B.put("MOV B,B", "40");
        mnemonics1B.put("MOV B,C", "41");
        mnemonics1B.put("MOV B,D", "42");
        mnemonics1B.put("MOV B,E", "43");
        mnemonics1B.put("MOV B,H", "44");
        mnemonics1B.put("MOV B,L", "45");
        mnemonics1B.put("MOV B,M", "46");
        mnemonics1B.put("MOV B,A", "47");

        mnemonics1B.put("MOV C,B", "48");
        mnemonics1B.put("MOV C,C", "49");
        mnemonics1B.put("MOV C,D", "4a");
        mnemonics1B.put("MOV C,E", "4b");
        mnemonics1B.put("MOV C,H", "4c");
        mnemonics1B.put("MOV C,L", "4d");
        mnemonics1B.put("MOV C,M", "4e");
        mnemonics1B.put("MOV C,A", "4f");

        mnemonics1B.put("MOV D,B", "50");
        mnemonics1B.put("MOV D,C", "51");
        mnemonics1B.put("MOV D,D", "52");
        mnemonics1B.put("MOV D,E", "53");
        mnemonics1B.put("MOV D,H", "54");
        mnemonics1B.put("MOV D,L", "55");
        mnemonics1B.put("MOV D,M", "56");
        mnemonics1B.put("MOV D,A", "57");

        mnemonics1B.put("MOV E,B", "58");
        mnemonics1B.put("MOV E,C", "59");
        mnemonics1B.put("MOV E,D", "5a");
        mnemonics1B.put("MOV E,E", "5b");
        mnemonics1B.put("MOV E,H", "5c");
        mnemonics1B.put("MOV E,L", "5d");
        mnemonics1B.put("MOV E,M", "5e");
        mnemonics1B.put("MOV E,A", "5f");

        mnemonics1B.put("MOV H,B", "60");
        mnemonics1B.put("MOV H,C", "61");
        mnemonics1B.put("MOV H,D", "62");
        mnemonics1B.put("MOV H,E", "63");
        mnemonics1B.put("MOV H,H", "64");
        mnemonics1B.put("MOV H,L", "65");
        mnemonics1B.put("MOV H,M", "66");
        mnemonics1B.put("MOV H,A", "67");

        mnemonics1B.put("MOV L,B", "68");
        mnemonics1B.put("MOV L,C", "69");
        mnemonics1B.put("MOV L,D", "6a");
        mnemonics1B.put("MOV L,E", "6b");
        mnemonics1B.put("MOV L,H", "6c");
        mnemonics1B.put("MOV L,L", "6d");
        mnemonics1B.put("MOV L,M", "6e");
        mnemonics1B.put("MOV L,A", "6f");

        mnemonics1B.put("MOV M,B", "70");
        mnemonics1B.put("MOV M,C", "71");
        mnemonics1B.put("MOV M,D", "72");
        mnemonics1B.put("MOV M,E", "73");
        mnemonics1B.put("MOV M,H", "74");
        mnemonics1B.put("MOV M,L", "75");

        mnemonics1B.put("HLT", "76");
        mnemonics1B.put("MOV M,A", "77");
        mnemonics1B.put("MOV A,B", "78");
        mnemonics1B.put("MOV A,C", "79");
        mnemonics1B.put("MOV A,D", "7a");
        mnemonics1B.put("MOV A,E", "7b");
        mnemonics1B.put("MOV A,H", "7c");
        mnemonics1B.put("MOV A,L", "7d");
        mnemonics1B.put("MOV A,M", "7e");
        mnemonics1B.put("MOV A,A", "7f");

        mnemonics1B.put("ADD B", "80");
        mnemonics1B.put("ADD C", "81");
        mnemonics1B.put("ADD D", "82");
        mnemonics1B.put("ADD E", "83");
        mnemonics1B.put("ADD H", "84");
        mnemonics1B.put("ADD L", "85");
        mnemonics1B.put("ADD M", "86");
        mnemonics1B.put("ADD A", "87");

        mnemonics1B.put("ADC B", "88");
        mnemonics1B.put("ADC C", "89");
        mnemonics1B.put("ADC D", "8A");
        mnemonics1B.put("ADC E", "8B");
        mnemonics1B.put("ADC H", "8C");
        mnemonics1B.put("ADC L", "8D");
        mnemonics1B.put("ADC M", "8E");
        mnemonics1B.put("ADC A", "8F");

        mnemonics1B.put("SUB B", "90");
        mnemonics1B.put("SUB C", "91");
        mnemonics1B.put("SUB D", "92");
        mnemonics1B.put("SUB E", "93");
        mnemonics1B.put("SUB H", "94");
        mnemonics1B.put("SUB L", "95");
        mnemonics1B.put("SUB M", "96");
        mnemonics1B.put("SUB A", "97");

        mnemonics1B.put("SBB B", "98");
        mnemonics1B.put("SBB C", "99");
        mnemonics1B.put("SBB D", "9A");
        mnemonics1B.put("SBB E", "9B");
        mnemonics1B.put("SBB H", "9C");
        mnemonics1B.put("SBB L", "9D");
        mnemonics1B.put("SBB M", "9E");
        mnemonics1B.put("SBB A", "9F");

        mnemonics1B.put("ANA B", "A0");
        mnemonics1B.put("ANA C", "A1");
        mnemonics1B.put("ANA D", "A2");
        mnemonics1B.put("ANA E", "A3");
        mnemonics1B.put("ANA H", "A4");
        mnemonics1B.put("ANA L", "A5");
        mnemonics1B.put("ANA M", "A6");
        mnemonics1B.put("ANA A", "A7");

        mnemonics1B.put("XRA B", "A8");
        mnemonics1B.put("XRA C", "A9");
        mnemonics1B.put("XRA D", "AA");
        mnemonics1B.put("XRA E", "AB");
        mnemonics1B.put("XRA H", "AC");
        mnemonics1B.put("XRA L", "AD");
        mnemonics1B.put("XRA M", "AE");
        mnemonics1B.put("XRA A", "AF");

        mnemonics1B.put("ORA B", "B0");
        mnemonics1B.put("ORA C", "B1");
        mnemonics1B.put("ORA D", "B2");
        mnemonics1B.put("ORA E", "B3");
        mnemonics1B.put("ORA H", "B4");
        mnemonics1B.put("ORA L", "B5");
        mnemonics1B.put("ORA M", "B6");
        mnemonics1B.put("ORA A", "B7");

        mnemonics1B.put("CMP B", "B8");
        mnemonics1B.put("CMP C", "B9");
        mnemonics1B.put("CMP D", "BA");
        mnemonics1B.put("CMP E", "BB");
        mnemonics1B.put("CMP H", "BC");
        mnemonics1B.put("CMP L", "BD");
        mnemonics1B.put("CMP M", "BE");
        mnemonics1B.put("CMP A", "BF");


        mnemonics1B.put("RNZ", "C0");
        mnemonics1B.put("POP B", "C1");
        mnemonics1B.put("PUSH B", "C5");

        mnemonics1B.put("RST 0", "C7");
        mnemonics1B.put("RZ", "C8");
        mnemonics1B.put("RET", "C9");

        mnemonics1B.put("RST 1", "CF");
        mnemonics1B.put("RNC", "D0");
        mnemonics1B.put("POP D", "D1");
        mnemonics1B.put("PUSH D", "D5");
        mnemonics1B.put("RST 2", "D7");
        mnemonics1B.put("RC", "D8");
        mnemonics1B.put("RST 3", "DF");
        mnemonics1B.put("RPO", "E0");
        mnemonics1B.put("POP H", "E1");//

        mnemonics1B.put("XTHL", "E3");
        mnemonics1B.put("PUSH H", "E5");
        mnemonics1B.put("RST 4", "E7");
        mnemonics1B.put("RPE", "E8");
        mnemonics1B.put("PCHL", "E9");
        mnemonics1B.put("XCHG", "EB");
        mnemonics1B.put("XRI", "EE");
        mnemonics1B.put("RST 5", "EF");
        mnemonics1B.put("RP", "F0");
        mnemonics1B.put("POP PSW", "F1");
        mnemonics1B.put("DI", "F3");
        mnemonics1B.put("PUSH PSW", "F5");
        mnemonics1B.put("RST 6", "F7");
        mnemonics1B.put("RM", "F8");
        mnemonics1B.put("EI", "FB");
        mnemonics1B.put("RST 7", "FF");
        //-----------------------TwoByte----------------------//
        mnemonics2B.put("MVI B", "06");//Variant
        mnemonics2B.put("MVI C", "0E");//Variant
        mnemonics2B.put("MVI E", "1E");//Variant
        mnemonics2B.put("MVI D", "16");//Variant
        mnemonics2B.put("MVI H", "26");//Variant
        mnemonics2B.put("MVI L", "2E");//Variant
        mnemonics2B.put("MVI M", "36");//Variant
        mnemonics2B.put("MVI A", "3E");//Variant

        mnemonics2B.put("ADI", "C6");
        mnemonics2B.put("ACI", "CE");
        mnemonics2B.put("OUT", "D3");
        mnemonics2B.put("SUI", "D6");
        mnemonics2B.put("IN", "DB");
        mnemonics2B.put("SBI", "DE");
        mnemonics2B.put("ANI", "E6");
        mnemonics2B.put("ORI", "F6");
        mnemonics2B.put("SPHL", "F9");
        mnemonics2B.put("CPI", "FE");
        //-----------------------ThreeByte----------------------//
        // Pair Registers {B-C, D-E, H-L}
        mnemonics3B.put("LXI B", "01");  //Variant
        mnemonics3B.put("LXI BC", "01"); //Variant
        mnemonics3B.put("LXI D", "11");  //Variant
        mnemonics3B.put("LXI DE", "11"); //Variant
        mnemonics3B.put("LXI H", "21");  //Variant
        mnemonics3B.put("LXI HL", "21"); //Variant
        mnemonics3B.put("LXI SP", "31"); //Variant
        mnemonics3B.put("SHLD", "22");
        mnemonics3B.put("LHLD", "2A");
        mnemonics3B.put("STA", "32");
        mnemonics3B.put("LDA", "3A");
        mnemonics3B.put("JNZ", "C2");
        mnemonics3B.put("JMP", "C3");
        mnemonics3B.put("CNZ", "C4");
        mnemonics3B.put("JZ", "CA");
        mnemonics3B.put("CZ", "CC");
        mnemonics3B.put("CALL", "CD");
        mnemonics3B.put("JNC", "D2");
        mnemonics3B.put("CNC", "D4");
        mnemonics3B.put("JC", "DA");
        mnemonics3B.put("CC", "DC");
        mnemonics3B.put("JPO", "E2");
        mnemonics3B.put("CPO", "E4");
        mnemonics3B.put("JPE", "EA");
        mnemonics3B.put("CPE", "EC");
        mnemonics3B.put("JP", "F2");
        mnemonics3B.put("CP", "F4");
        mnemonics3B.put("JM", "FA");
        mnemonics3B.put("CM", "FC");
        //------------------------------------------------------//
    }

    public static boolean isValidInstruction(String inst, StringBuilder hexCode) throws Exception {
        String[] words = inst.toUpperCase().split(" ");
        StringBuilder tmp = new StringBuilder(words[0] + " ");
        for (int i = 1; i < words.length; i++) {
            if (!words[i].equals(" "))
                tmp.append(words[i]);
        }
        inst = tmp.toString().trim();
        if (mnemonics1B.containsKey(inst)) {
            hexCode.append(mnemonics1B.get(inst));
            return true;
        } else if (mnemonics2B.containsKey(inst.split(" ")[0]) || inst.startsWith("MVI")) {//Split Opcode & address ex [MVI A,42H]
            String operand;
            if (inst.startsWith("MVI")) {//Edge case
                operand = inst.split(",")[1];
                String tmpInst = mnemonics2B.get(inst.split(",")[0]);
                if(tmpInst == null)
                    throw new Exception("No Such Instruction");
                hexCode.append(tmpInst);
            } else {
                operand = inst.split(" ")[1];
                hexCode.append(mnemonics2B.get(inst.split(" ")[0]));
            }
            return isValidImmediat(operand, 0xff, hexCode);
        } else if (mnemonics3B.containsKey(inst.split(" ")[0]) || inst.startsWith("LXI")) {//Split Opcode & address ex [STA,1212H]
            String operand;
            if (inst.startsWith("LXI")) {//Edge case
                operand = inst.split(",")[1];
                String tmpInst = mnemonics3B.get(inst.split(",")[0]);
                if(tmpInst == null)
                    throw new Exception("No Such Instruction");
                hexCode.append(tmpInst);

            } else {
                operand = inst.split(" ")[1];
                hexCode.append(mnemonics3B.get(inst.split(" ")[0]));
            }
            return isValidImmediat(operand, 0xffff, hexCode);
        }
        return false;
    }

    public static boolean isValidImmediat(String operand, int maximumImmediat, StringBuilder hexCode) throws Exception {
        int value ;
        try{
            if (operand.endsWith("H"))
                value = HexFormat.fromHexDigits(operand.replace("H", ""));// Asserting Address is 16-bits
            else if (operand.startsWith(".") || operand.endsWith("D"))
                value = Integer.parseInt(operand.replace(".", "").replace("D", ""));
            else
                    value = Integer.parseInt(operand);
        }catch (Exception e){
            throw new Exception("Illegal Operand");
        }
        if (value <= maximumImmediat) {
            if (maximumImmediat == 0xff)
                hexCode.append("%02X".formatted(value));
            else {
                hexCode.append("%02X".formatted(value & 0xff));//LSB
                hexCode.append("%02X".formatted(value >> 8));//MSB Shift Right one byte
            }
        } else {
            throw new Exception("Operand Larger Than " + String.format("0x%x", maximumImmediat)/*print hex value example: 0xff*/);
        }
        return true;
    }
}
