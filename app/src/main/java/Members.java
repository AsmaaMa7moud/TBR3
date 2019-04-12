/**
 * Created by DELL on 09/02/2019.
 */


    public class Members {
        private String name;
        private String job;
        private int iconID;
        private String links;

        public Members(String name, String job, int iconID, String links) {
            super();
            this.name = name;
            this.job = job;
            this.iconID = iconID;
            this.links = links;
        }

        public String getName() {
            return name;
        }

        public String getJob() {
            return job;
        }

        public int getIconID() {
            return iconID;
        }

        public String getLinks() {
            return links;
        }

    }



