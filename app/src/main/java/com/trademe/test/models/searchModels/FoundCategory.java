package com.trademe.test.models.searchModels;

/**
 * Created by alexanderparra on 18/01/16.
 */
public class FoundCategory {

        private int Count;
        private String Category;
        private String Name;
        private boolean IsRestricted;

        /**
         *
         * @return
         * The Count
         */
        public int getCount() {
            return Count;
        }

        /**
         *
         * @param Count
         * The Count
         */
        public void setCount(int Count) {
            this.Count = Count;
        }

        /**
         *
         * @return
         * The Category
         */
        public String getCategory() {
            return Category;
        }

        /**
         *
         * @param Category
         * The Category
         */
        public void setCategory(String Category) {
            this.Category = Category;
        }

        /**
         *
         * @return
         * The Name
         */
        public String getName() {
            return Name;
        }

        /**
         *
         * @param Name
         * The Name
         */
        public void setName(String Name) {
            this.Name = Name;
        }

        /**
         *
         * @return
         * The IsRestricted
         */
        public boolean isIsRestricted() {
            return IsRestricted;
        }

        /**
         *
         * @param IsRestricted
         * The IsRestricted
         */
        public void setIsRestricted(boolean IsRestricted) {
            this.IsRestricted = IsRestricted;
        }
}
