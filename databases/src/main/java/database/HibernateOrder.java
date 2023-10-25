Order order = new Order();

        // makes a new date object that represents right now
        Date orderDate = new Date();
        order.setOrderDate(orderDate);


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date requredDate = sdf.parse("2023-10-31 12:30");

        // this is the # of miliseconds since the epoch
        System.out.println(orderDate.getTime());

        order.setRequiredDate(requredDate);

        // here we are setting the shipped date to  null because the order has not
        // yet shipped
        order.setShippedDate(null);