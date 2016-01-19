package com.trademe.test.models.searchModels;

/**
 * Created by alexanderparra on 18/01/16.
 */
public class DealPromotionInfo {

        private int Id;
        private String Title;
        private String StartDateTime;
        private String EndDateTime;
        private boolean IsActive;
        private String AsAt;

        /**
         *
         * @return
         * The Id
         */
        public int getId() {
            return Id;
        }

        /**
         *
         * @param Id
         * The Id
         */
        public void setId(int Id) {
            this.Id = Id;
        }

        /**
         *
         * @return
         * The Title
         */
        public String getTitle() {
            return Title;
        }

        /**
         *
         * @param Title
         * The Title
         */
        public void setTitle(String Title) {
            this.Title = Title;
        }

        /**
         *
         * @return
         * The StartDateTime
         */
        public String getStartDateTime() {
            return StartDateTime;
        }

        /**
         *
         * @param StartDateTime
         * The StartDateTime
         */
        public void setStartDateTime(String StartDateTime) {
            this.StartDateTime = StartDateTime;
        }

        /**
         *
         * @return
         * The EndDateTime
         */
        public String getEndDateTime() {
            return EndDateTime;
        }

        /**
         *
         * @param EndDateTime
         * The EndDateTime
         */
        public void setEndDateTime(String EndDateTime) {
            this.EndDateTime = EndDateTime;
        }

        /**
         *
         * @return
         * The IsActive
         */
        public boolean isIsActive() {
            return IsActive;
        }

        /**
         *
         * @param IsActive
         * The IsActive
         */
        public void setIsActive(boolean IsActive) {
            this.IsActive = IsActive;
        }

        /**
         *
         * @return
         * The AsAt
         */
        public String getAsAt() {
            return AsAt;
        }

        /**
         *
         * @param AsAt
         * The AsAt
         */
        public void setAsAt(String AsAt) {
            this.AsAt = AsAt;
        }
}
