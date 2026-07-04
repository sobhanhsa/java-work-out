class CookieJar {
    public int cookies;

    public CookieJar(int cookies) {
        this.cookies = cookies;
    }
}

// cookies can be accessed directly since it is a public field.
// so it can be modified directly without any restrictions. 
// so any invalid and unreal value can be assigned to it, 
// solution ? -> encapsulation

class BetterCookieJar {
    public int cookies;

    public BetterCookieJar() {
        this.cookies = 0;
    }

    public int getCookies() {
        return cookies;
    }


    public int addCookies(int cookies) {
        if (cookies < 0) {
            System.out.println("Invalid value for cookies. It cannot be negative.");
            return this.cookies; // Return current value without changing it
        }
        this.cookies += cookies;
        return this.cookies;
    }

    public int pickCookies(int count) {
        if (count < 0) {
            System.out.println("Invalid value for cookies. It cannot be negative.");
            return this.cookies; // Return current value without changing it
        }
        if (cookies > this.cookies) {
            System.out.println("Not enough cookies in the jar.");
            return this.cookies; // Return current value without changing it
        }
        this.cookies -= cookies;
        return this.cookies;
    }

}