INSERT INTO Flight(flight_number,carrier_name,flight_model,seat_capacity) VALUES(1232,'Indigo','6E4499',120);
INSERT INTO Flight(flight_number,carrier_name,flight_model,seat_capacity) VALUES(1210,'AirAsia','6E4789',120);

INSERT INTO Airport(airport_code,airport_location,airport_name) VALUES('VTZ','vizag','vishakapatnam airport');
INSERT INTO Airport(airport_code,airport_location,airport_name) VALUES('DEL','Delhi','Indhiragandhi airport');
INSERT INTO Airport(airport_code,airport_location,airport_name) VALUES('HYB','Hyderabad','Rajiv gandhi airport');




INSERT INTO Users(user_id,user_name,user_phone,user_type,email,password) VALUES(1,'deep',7981678687,'admin','k78@gmail.com','nara');
INSERT INTO Users(user_id,user_name,user_phone,user_type,email,password) VALUES(2,'san',98157620,'user','sand01@gmail.com','ak@01');


INSERT INTO Booking(booking_id,bookingdate,no_of_passengers,ticket_cost,flight_num,user_id) VALUES(1,date '2020-04-22',12,5000,1232,1);
INSERT INTO Booking(booking_id,bookingdate,no_of_passengers,ticket_cost,flight_num,user_id) VALUES(2,date '2020-04-23',5,6500,1210,2);


INSERT INTO Passenger(pnr_number,luggage,passenger_age,passenger_name,booking_id) VALUES(11345,2.5,21,'dares',1);
INSERT INTO Passenger(pnr_number,luggage,passenger_age,passenger_name,booking_id) VALUES(12245,10,31,'dares1',1);
INSERT INTO Passenger(pnr_number,luggage,passenger_age,passenger_name,booking_id) VALUES(11335,9,29,'dares2',2);
INSERT INTO Passenger(pnr_number,luggage,passenger_age,passenger_name,booking_id) VALUES(22345,12,25,'deep',2);

INSERT INTO schedule(schedule_id,arrival_time,departure_time,dest_airport_code,source_airport_code) VALUES(2,timestamp '2020-05-20 14:30:00',timestamp '2020-05-21 11:30:00','DEL','HYB');

