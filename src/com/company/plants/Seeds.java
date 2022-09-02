package com.company.plants;

public class Seeds {
    private String growthDuration;

    public String getGrowthDuration() {
        return growthDuration;
    }

    public void setGrowthDuration(String growthDuration) {
        this.growthDuration = growthDuration;
    }

    public Seeds(String growthDuration) {
        this.growthDuration = growthDuration;
    }

    public static class Rostock{ // inner static
        private SeedsStatus seedsStatus;

        public SeedsStatus getSeedsStatus() {
            return seedsStatus;
        }

        public void setSeedsStatus(SeedsStatus seedsStatus) {
            this.seedsStatus = seedsStatus;
        }
        public void decribe(){
            System.out.println("Росток в состоянии:" + seedsStatus);
        }
    }
}
