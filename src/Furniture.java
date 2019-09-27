public class Furniture {

        private String material;
        private String furnitureType;
        private boolean isBroken = false;
        private boolean isBurnt = false;

        public Furniture(String furnitureType, String materialType) {
            this.material = materialType;
            this.furnitureType = furnitureType;

        }
        public String getType(){
            return furnitureType;
        }
        public Boolean getBroken(){
            return isBroken;
        }
        public Boolean getBurnt(){
            return isBurnt;
        }


        public void setFire() {
            if (material == "plywood") {
                this.isBurnt = true;
            }

        }

        public void setBlunt() {
            if (material == "plywood" || material == "glass") {
                this.isBroken = true;
            }
        }

        public String toString() {
            return(material + " " + furnitureType);
        }

        // You write any functions needed to change state and print the status of the furniture instanc
}
