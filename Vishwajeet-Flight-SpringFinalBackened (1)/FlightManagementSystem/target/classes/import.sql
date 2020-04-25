INSERT INTO Flight(flight_number,carrier_name,flight_model,seat_capacity) VALUES(1232,'Indigo','6E4499',120);
INSERT INTO Flight(flight_number,carrier_name,flight_model,seat_capacity) VALUES(1210,'AirAsia','6E4789',120);

INSERT INTO Airport(airport_code,airport_location,airport_name) VALUES('VTZ','vizag','vishakapatnam airport');
INSERT INTO Airport(airport_code,airport_location,airport_name) VALUES('DEL','Delhi','Indhiragandhi airport');
INSERT INTO Airport(airport_code,airport_location,airport_name) VALUES('HYB','Hyderabad','Rajiv gandhi airport');


INSERT INTO Passenger(pnr_number,luggage,passenger_age,passenger_name) VALUES(11345,2.5,21,'sandeep');
INSERT INTO Passenger(pnr_number,luggage,passenger_age,passenger_name) VALUES(12245,10,31,'karteek');
INSERT INTO Passenger(pnr_number,luggage,passenger_age,passenger_name) VALUES(11335,9,29,'akshay');
INSERT INTO Passenger(pnr_number,luggage,passenger_age,passenger_name) VALUES(22345,12,25,'sunil');


INSERT INTO Users(user_id,user_name,user_phone,user_type,email,password) VALUES(1,'Narasimha',7981678687,'admin','kasula78@gmail.com','nara');
INSERT INTO Users(user_id,user_name,user_phone,user_type,email,password) VALUES(2,'sandeep',9815762620,'user','sandeepakshay0101@gmail.com','akshay@0101');


INSERT INTO Booking(booking_id,bookingdate,no_of_passengers,ticket_cost,flight_num,user_id) VALUES(12345,date '2020-04-22',12,5000,1232,1);
INSERT INTO Booking(booking_id,bookingdate,no_of_passengers,ticket_cost,flight_num,user_id) VALUES(23456,date '2020-04-23',5,6500,1210,2);

INSERT INTO schedule(schedule_id,arrival_time,departure_time,dest_airport_code,arivval_airport_code) VALUES(17896,timestamp '2020-05-23 12:00:00',timestamp '2020-05-20 09:00:00','VTZ','DEL');
INSERT INTO schedule(schedule_id,arrival_time,departure_time,dest_airport_code,arivval_airport_code) VALUES(29658,timestamp '2020-05-20 14:30:00',timestamp '2020-05-21 11:30:00','DEL','HYB');

INSERT INTO scheduled_flight(available_seats,flight,schedule) VALUES(121,1232,1);
