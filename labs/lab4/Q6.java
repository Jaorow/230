enum Day{
        MONDAY,TUESDAY,WEDNSDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
        public boolean isWeekDay(){
            return ordinal()< 5;
        }

        public boolean isHoliday(){
            return ordinal()>=5;
        }
}