class Solution {
    public int solution(int chicken) {
        return serviceChicken(chicken);
    }
    
    private int serviceChicken(int coupon) {
        if(coupon < 10) return 0;
        
        int serviceChicken = coupon / 10;
        int serviceCoupon = serviceChicken;
        int restCoupon = coupon % 10;

        return serviceChicken + serviceChicken(serviceCoupon + restCoupon);
    }
}