class Solution {
    public String validIPAddress(String IP) {
        
		if (IP.indexOf(".") != -1 && IP.indexOf("..") == -1) {
            if (IP.charAt(0) == '.' || IP.charAt(IP.length() - 1) == '.') return "Neither";
            String[] ips = IP.split("\\.");
            if (ips.length != 4) return "Neither";
            for (int i = 0; i < 4; i++) {
                if (ips[i].equals("") || ips[i].length() > 3 || (ips[i].length() > 1 && ips[i].charAt(0) == '0')) return "Neither";
                for (char c : ips[i].toCharArray()) {
                    if (c < '0' || c > '9') return "Neither";
                }
                int ip = Integer.valueOf(ips[i]);
                if (ip < 0 || ip > 255) return "Neither";
            }
            return "IPv4";
        }
        if (IP.indexOf(":") != -1 && IP.indexOf("::") == -1) {
            if (IP.charAt(0) == ':' || IP.charAt(IP.length() - 1) == ':') return "Neither";
            String[] ips = IP.toLowerCase().split(":");
            if (ips.length != 8) return "Neither";
            for (int i = 0; i < 8; i++) {
                if (ips[i].equals("") || ips[i].length() > 4) return "Neither";
                for (char c : ips[i].toCharArray()) {
                    if (c < '0' || ( c > '9' && c < 'a') || c > 'f') return "Neither";
                }
            }
            return "IPv6";
        }
        return "Neither";
    }
}