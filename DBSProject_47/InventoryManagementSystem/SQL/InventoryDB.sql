CREATE DATABASE  IF NOT EXISTS `inventory`;
USE `inventory`;

-- products table:
DROP TABLE IF EXISTS `products`;
CREATE TABLE `products` (
  `pid` int NOT NULL AUTO_INCREMENT,
  `productcode` varchar(45) NOT NULL,
  `productname` varchar(45) NOT NULL,
  `costprice` double NOT NULL,
  `sellprice` double NOT NULL,
  `brand` varchar(45) NOT NULL,
  PRIMARY KEY (`pid`),
  UNIQUE KEY `productcode_UNIQUE` (`productcode`)
) ENGINE=InnoDB AUTO_INCREMENT=130 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


--
-- Dumping data for table `products`
--

LOCK TABLES `products` WRITE;
INSERT INTO `products` VALUES
(1, 'FMCG0001', 'Toothpaste', 18, 20, 'Colgate'),
(2, 'FMCG0002', 'Toothpaste', 17, 20, 'Pepsodent'),
(3, 'FMCG0003', 'Shampoo', 18, 20, 'Clinic Plus'),
(4, 'FMCG0004', 'Soft Drink', 18, 20, 'Pepsi'),
(5, 'FMCG0005', 'Toothpaste', 15, 18, 'Oral-B'),
(6, 'FMCG0006', 'Biscuits', 10, 12, 'Oreo'),
(7, 'FMCG0007', 'Biscuits', 10, 12, 'Parle-G'),
(8, 'FMCG0008', 'Chocolate', 45, 50, 'Cadbury'),
(9, 'FMCG0009', 'Chocolate', 15, 17, 'Nestle'),
(10, 'FMCG0010', 'Shampoo', 220, 250, 'Head & Shoulders'),
(11, 'FMCG0011', 'Shampoo', 180, 200, 'Pantene'),
(12, 'FMCG0012', 'Soap', 25, 30, 'Dove'),
(13, 'FMCG0013', 'Soap', 20, 25, 'Lux'),
(14, 'FMCG0014', 'Deodorant', 180, 200, 'Axe'),
(15, 'FMCG0015', 'Deodorant', 170, 190, 'Nivea'),
(16, 'FMCG0016', 'Soft Drink', 30, 35, 'Coca-Cola'),
(17, 'FMCG0017', 'Soft Drink', 85, 90, 'Mountain Dew'),
(18, 'FMCG0018', 'Tea', 150, 160, 'Taj Mahal'),
(19, 'FMCG0019', 'Tea', 120, 130, 'Red Label'),
(20, 'FMCG0020', 'Coffee', 250, 260, 'Nescafe'),
(21, 'FMCG0021', 'Coffee', 240, 250, 'Bru'),
(22, 'FMCG0022', 'Cereal', 175, 185, 'Kellogg\'s'),
(23, 'FMCG0023', 'Cereal', 160, 170, 'Quaker'),
(24, 'FMCG0024', 'Cheese', 100, 110, 'Amul'),
(25, 'FMCG0025', 'Cheese', 105, 115, 'Britannia'),
(26, 'FMCG0026', 'Butter', 50, 55, 'Amul'),
(27, 'FMCG0027', 'Butter', 52, 57, 'Britannia'),
(28, 'FMCG0028', 'Yogurt', 30, 35, 'Nestle'),
(29, 'FMCG0029', 'Yogurt', 28, 33, 'Amul'),
(30, 'FMCG0030', 'Snack', 20, 25, 'Lay\'s'),
(31, 'FMCG0031', 'Snack', 10, 15, 'Bingo'),
(32, 'FMCG0032', 'Snack', 12, 18, 'Haldiram\'s'),
(33, 'FMCG0033', 'Juice', 99, 105, 'Real'),
(34, 'FMCG0034', 'Juice', 95, 100, 'Tropicana'),
(35, 'FMCG0035', 'Ketchup', 75, 80, 'Heinz'),
(36, 'FMCG0036', 'Ketchup', 70, 75, 'Kissan'),
(37, 'FMCG0037', 'Jelly', 30, 35, 'Hartley\'s'),
(38, 'FMCG0038', 'Jelly', 28, 33, 'Smucker\'s'),
(39, 'FMCG0039', 'Ice Cream', 60, 65, 'Häagen-Dazs'),
(40, 'FMCG0040', 'Ice Cream', 55, 60, 'Ben & Jerry\'s'),
(41, 'FMCG0041', 'Rice', 80, 90, 'Basmati'),
(42, 'FMCG0042', 'Rice', 75, 85, 'Jasmine'),
(43, 'FMCG0043', 'Pasta', 35, 40, 'Barilla'),
(44, 'FMCG0044', 'Pasta', 30, 35, 'De Cecco'),
(45, 'FMCG0045', 'Oil', 120, 130, 'Saffola'),
(46, 'FMCG0046', 'Oil', 110, 120, 'Fortune'),
(47, 'FMCG0047', 'Salad Dressing', 150, 160, 'Kraft'),
(48, 'FMCG0048', 'Salad Dressing', 145, 155, 'Hellmann\'s'),
(49, 'FMCG0049', 'Soup', 50, 55, 'Campbell\'s'),
(50, 'FMCG0050', 'Soup', 45, 50, 'Knorr'),
(51, 'FMCG0051', 'Noodles', 20, 25, 'Maggi'),
(52, 'FMCG0052', 'Noodles', 18, 23, 'Top Ramen'),
(53, 'FMCG0053', 'Condiments', 90, 95, 'McCormick'),
(54, 'FMCG0054', 'Condiments', 85, 90, 'Old Bay'),
(55, 'FMCG0055', 'Sauce', 25, 30, 'Tabasco'),
(56, 'FMCG0056', 'Sauce', 23, 28, 'Sriracha'),
(57, 'FMCG0057', 'Mustard', 20, 25, 'French\'s'),
(58, 'FMCG0058', 'Mustard', 19, 24, 'Heinz'),
(59, 'FMCG0059', 'Pickles', 35, 40, 'Vlasic'),
(60, 'FMCG0060', 'Pickles', 30, 35, 'Heinz'),
(61, 'FMCG0061', 'Popcorn', 15, 20, 'Orville Redenbacher\'s'),
(62, 'FMCG0062', 'Popcorn', 14, 19, 'Act II'),
(63, 'FMCG0063', 'Chips', 10, 15, 'Pringles'),
(64, 'FMCG0064', 'Chips', 12, 17, 'Kettle Brand'),
(65, 'FMCG0065', 'Energy Drink', 100, 110, 'Red Bull'),
(66, 'FMCG0066', 'Energy Drink', 95, 105, 'Monster'),
(67, 'FMCG0067', 'Water', 8, 10, 'Aquafina'),
(68, 'FMCG0068', 'Water', 7, 9, 'Dasani'),
(69, 'FMCG0069', 'Baby Food', 120, 130, 'Gerber'),
(70, 'FMCG0070', 'Baby Food', 115, 125, 'Similac'),
(71, 'FMCG0071', 'Diapers', 250, 260, 'Pampers'),
(72, 'FMCG0072', 'Diapers', 240, 250, 'Huggies'),
(73, 'FMCG0073', 'Pet Food', 180, 190, 'Pedigree'),
(74, 'FMCG0074', 'Pet Food', 175, 185, 'Purina'),
(75, 'FMCG0075', 'Detergent', 150, 160, 'Tide'),
(76, 'FMCG0076', 'Detergent', 140, 150, 'Ariel'),
(77, 'FMCG0077', 'Toilet Cleaner', 85, 95, 'Harpic'),
(78, 'FMCG0078', 'Toilet Cleaner', 80, 90, 'Domex'),
(79, 'FMCG0079', 'Floor Cleaner', 85, 95, 'Lizol'),
(80, 'FMCG0080', 'Floor Cleaner', 80, 90, 'Mr. Clean'),
(81, 'FMCG0081', 'Air Freshener', 75, 85, 'Air Wick'),
(82, 'FMCG0082', 'Air Freshener', 70, 80, 'Glade'),
(83, 'FMCG0083', 'Facial Tissue', 50, 55, 'Kleenex'),
(84, 'FMCG0084', 'Facial Tissue', 45, 50, 'Puffs'),
(85, 'FMCG0085', 'Toothbrush', 25, 30, 'Colgate'),
(86, 'FMCG0086', 'Toothbrush', 23, 28, 'Oral-B'),
(87, 'FMCG0087', 'Mouthwash', 85, 90, 'Listerine'),
(88, 'FMCG0088', 'Mouthwash', 80, 85, 'Colgate'),
(89, 'FMCG0089', 'Skin Cream', 120, 130, 'Nivea'),
(90, 'FMCG0090', 'Skin Cream', 115, 125, 'Olay'),
(91, 'FMCG0091', 'Hair Gel', 75, 80, 'Set Wet'),
(92, 'FMCG0092', 'Hair Gel', 70, 75, 'Brylcreem'),
(93, 'FMCG0093', 'Shaving Cream', 50, 55, 'Gillette'),
(94, 'FMCG0094', 'Shaving Cream', 45, 50, 'Nivea'),
(95, 'FMCG0095', 'Sunscreen', 150, 160, 'Neutrogena'),
(96, 'FMCG0096', 'Sunscreen', 145, 155, 'Lotus Herbals'),
(97, 'FMCG0097', 'Hand Sanitizer', 20, 25, 'Purell'),
(98, 'FMCG0098', 'Hand Sanitizer', 18, 23, 'Dettol'),
(99, 'FMCG0099', 'Facial Cleanser', 60, 65, 'Cetaphil'),
(100, 'FMCG0100', 'Facial Cleanser', 58, 63, 'Clean & Clear')
;
UNLOCK TABLES;

--
-- Table structure for table `customers`
--

DROP TABLE IF EXISTS `customers`;
CREATE TABLE `customers` (
  `cid` int NOT NULL AUTO_INCREMENT,
  `customercode` varchar(45) NOT NULL,
  `fullname` varchar(45) NOT NULL,
  `location` varchar(45) NOT NULL,
  `phone` varchar(45) NOT NULL,
  PRIMARY KEY (`cid`),
  UNIQUE KEY (customercode)
) ENGINE=InnoDB AUTO_INCREMENT=307 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `customers`
--

LOCK TABLES `customers` WRITE;
INSERT INTO `customers` VALUES (301,'vip1','Nishit Soni','Mumbai','9743226116'),
(302,'vip2','Shikhar Bijaar','Basti','9211696969'),
(303,'std1','Abhijeet Loondry','Basti','9236215622'),
(304,'std2','Mohit Yadav','Pilani','8854612478'),
(306,'vip3','Abhinav Neta','Pilani','9826546182'), 
(307, 'std3', 'Rakshit Giant', 'Africa', '1234567890'), 
(308, 'std5', 'Anuj Anna', 'Bangladesh', '9999900000');
UNLOCK TABLES;

--
-- Table structure for table `suppliers`
--
DROP TABLE IF EXISTS `suppliers`;
CREATE TABLE `suppliers` (
  `sid` int NOT NULL AUTO_INCREMENT,
  `suppliercode` varchar(45) NOT NULL,
  `fullname` varchar(45) NOT NULL,
  `location` varchar(45) NOT NULL,
  `mobile` varchar(10) NOT NULL,
  PRIMARY KEY (`sid`),
  UNIQUE KEY (suppliercode)
) ENGINE=InnoDB AUTO_INCREMENT=409 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
--
-- Dumping data for table `suppliers`
--
LOCK TABLES `suppliers` WRITE;
INSERT INTO `suppliers` VALUES 
(401, 'SUP001', 'Hindustan Unilever', 'Mumbai', '9820000011'),
(402, 'SUP002', 'Procter & Gamble', 'Kolkata', '9820000022'),
(403, 'SUP003', 'Nestle India', 'Delhi', '9820000033'),
(404, 'SUP004', 'ITC Limited', 'Bangalore', '9820000044'),
(405, 'SUP005', 'PepsiCo India', 'Gurgaon', '9820000055'),
(406, 'SUP006', 'Parle Agro', 'Mumbai', '9820000066'),
(407, 'SUP007', 'Britannia Industries', 'Kolkata', '9820000077'),
(408, 'SUP008', 'Amul', 'Ahmedabad', '9820000088'),
(409, 'SUP009', 'Coca-Cola India', 'Pune', '9820000099'),
(410, 'SUP010', 'Dabur India Ltd', 'Noida', '9820000100'),
(411, 'SUP011', 'Tata Consumer Products', 'Mumbai', '9820000111'),
(412, 'SUP012', 'Godrej Consumer Products', 'Delhi', '9820000122'),
(413, 'SUP013', 'Marico Limited', 'Bangalore', '9820000133'),
(414, 'SUP014', 'Patanjali Ayurved', 'Haridwar', '9820000144'),
(415, 'SUP015', 'Loreal India', 'Mumbai', '9820000155'),
(416, 'SUP016', 'Colgate-Palmolive India', 'Hyderabad', '9820000166'),
(417, 'SUP017', 'Johnson & Johnson India', 'Chennai', '9820000177'),
(418, 'SUP018', 'GSK India', 'Mumbai', '9820000188'),
(419, 'SUP019', 'Bayer India', 'Bangalore', '9820000199'),
(420, 'SUP020', 'Sun Pharma', 'Indore', '9820000200')
;
UNLOCK TABLES;

--
-- Table structure for table `users`
--
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `location` varchar(45) NOT NULL,
  `phone` varchar(10) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(200) NOT NULL,
  `usertype` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
--
-- Dumping data for table `users`
--
LOCK TABLES `users` WRITE;
INSERT INTO `users` VALUES (17,'Hitansh Gujju','Mumbai','9650786717','tannaSpons','dbadpass','ADMINISTRATOR'),
(18,'Pandey Kattebaz','Kanpur','9660654785','stduser1','dbstdpass','EMPLOYEE'),
(20,'Harsh Dalla','Local','9876543210','root','root','ADMINISTRATOR'),
(29,'Trial Employee','Local','1122334455','emp1','emp1','EMPLOYEE');
UNLOCK TABLES;

--
-- Table structure for table `currentstock`
--
DROP TABLE IF EXISTS `currentstock`;

CREATE TABLE `currentstock` (
  `productcode` varchar(45) NOT NULL,
  `quantity` int NOT NULL,
  PRIMARY KEY (`productcode`),
  FOREIGN KEY (productcode) references products(productcode)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
--
-- Dumping data for table `currentstock`
--
LOCK TABLES `currentstock` WRITE;
INSERT INTO `currentstock` VALUES 
('FMCG0001', 10),
('FMCG0002', 15),
('FMCG0003', 12),
('FMCG0004', 20),
('FMCG0005', 8),
('FMCG0006', 25),
('FMCG0007', 30),
('FMCG0008', 5),
('FMCG0009', 7),
('FMCG0010', 10),
('FMCG0011', 14),
('FMCG0012', 18),
('FMCG0013', 22),
('FMCG0014', 9),
('FMCG0015', 11),
('FMCG0016', 33),
('FMCG0017', 25),
('FMCG0018', 6),
('FMCG0019', 12),
('FMCG0020', 19),
('FMCG0021', 21),
('FMCG0022', 13),
('FMCG0023', 15),
('FMCG0024', 17),
('FMCG0025', 10),
('FMCG0026', 8),
('FMCG0027', 16),
('FMCG0028', 20),
('FMCG0029', 24),
('FMCG0030', 27),
('FMCG0031', 30),
('FMCG0032', 22),
('FMCG0033', 18),
('FMCG0034', 14),
('FMCG0035', 11),
('FMCG0036', 9),
('FMCG0037', 7),
('FMCG0038', 5),
('FMCG0039', 13),
('FMCG0040', 15),
('FMCG0041', 17),
('FMCG0042', 19),
('FMCG0043', 21),
('FMCG0044', 10),
('FMCG0045', 12),
('FMCG0046', 14),
('FMCG0047', 16),
('FMCG0048', 18),
('FMCG0049', 20),
('FMCG0050', 22),
('FMCG0051', 5),
('FMCG0052', 7),
('FMCG0053', 9),
('FMCG0054', 11),
('FMCG0055', 13),
('FMCG0056', 15),
('FMCG0057', 17),
('FMCG0058', 19),
('FMCG0059', 21),
('FMCG0060', 23),
('FMCG0061', 10),
('FMCG0062', 12),
('FMCG0063', 15),
('FMCG0064', 17),
('FMCG0065', 19),
('FMCG0066', 21),
('FMCG0067', 23),
('FMCG0068', 25),
('FMCG0069', 30),
('FMCG0070', 35)
;
UNLOCK TABLES;

--
-- Table structure for table `purchaseinfo`
--
DROP TABLE IF EXISTS `purchaseinfo`;
CREATE TABLE `purchaseinfo` (
  `purchaseID` int NOT NULL AUTO_INCREMENT,
  `suppliercode` varchar(45) NOT NULL,
  `productcode` varchar(45) NOT NULL,
  `date` varchar(45) NOT NULL,
  `quantity` int NOT NULL,
  `totalcost` double NOT NULL,
  PRIMARY KEY (`purchaseID`),
  FOREIGN KEY (suppliercode) references suppliers(suppliercode),
  FOREIGN KEY (productcode) references currentstock(productcode)
) ENGINE=InnoDB AUTO_INCREMENT=1012 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `purchaseinfo`
--

LOCK TABLES `purchaseinfo` WRITE;
INSERT INTO `purchaseinfo` VALUES
(1, 'SUP001', 'FMCG0001', '2023-04-10', 50, 900.0),
(2, 'SUP001', 'FMCG0005', '2023-04-11', 40, 600.0),
(3, 'SUP002', 'FMCG0010', '2023-04-12', 30, 6600.0),
(4, 'SUP003', 'FMCG0009', '2023-04-13', 25, 425.0),
(5, 'SUP004', 'FMCG0011', '2023-04-14', 60, 10800.0),
(6, 'SUP005', 'FMCG0004', '2023-04-15', 80, 1440.0),
(7, 'SUP006', 'FMCG0007', '2023-04-16', 100, 1200.0),
(8, 'SUP007', 'FMCG0022', '2023-04-17', 90, 15750.0),
(9, 'SUP008', 'FMCG0024', '2023-04-18', 110, 12100.0),
(10, 'SUP009', 'FMCG0004', '2023-04-19', 70, 1260.0),
(11, 'SUP010', 'FMCG0049', '2023-04-20', 85, 4250.0),
(12, 'SUP011', 'FMCG0019', '2023-04-21', 95, 12350.0),
(13, 'SUP012', 'FMCG0021', '2023-04-22', 50, 12500.0),
(14, 'SUP013', 'FMCG0043', '2023-04-23', 30, 1200.0),
(15, 'SUP014', 'FMCG0031', '2023-04-24', 75, 1125.0),
(16, 'SUP015', 'FMCG0040', '2023-04-25', 85, 5100.0),
(17, 'SUP016', 'FMCG0005', '2023-04-26', 45, 675.0),
(18, 'SUP017', 'FMCG0050', '2023-04-27', 55, 1100.0),
(19, 'SUP018', 'FMCG0020', '2023-04-28', 65, 15600.0),
(20, 'SUP019', 'FMCG0030', '2023-04-29', 40, 1000.0),
(21, 'SUP020', 'FMCG0051', '2023-04-30', 90, 1800.0),
(22, 'SUP001', 'FMCG0002', '2023-05-01', 80, 1360.0),
(23, 'SUP002', 'FMCG0014', '2023-05-02', 60, 12000.0),
(24, 'SUP003', 'FMCG0028', '2023-05-03', 50, 1750.0),
(25, 'SUP004', 'FMCG0032', '2023-05-04', 100, 2200.0),
(26, 'SUP005', 'FMCG0046', '2023-05-05', 55, 6600.0),
(27, 'SUP006', 'FMCG0008', '2023-05-06', 70, 3150.0),
(28, 'SUP007', 'FMCG0015', '2023-05-07', 85, 16150.0),
(29, 'SUP008', 'FMCG0023', '2023-05-08', 40, 6800.0),
(30, 'SUP009', 'FMCG0004', '2023-05-09', 30, 540.0)
;
UNLOCK TABLES;

--
-- Table structure for table `salesinfo`
--
DROP TABLE IF EXISTS `salesinfo`;
CREATE TABLE `salesinfo` (
  `salesid` int NOT NULL AUTO_INCREMENT,
  `date` varchar(45) NOT NULL,
  `productcode` varchar(45) NOT NULL,
  `customercode` varchar(45) NOT NULL,
  `quantity` int NOT NULL,
  `revenue` double NOT NULL,
  `soldby` varchar(45) NOT NULL,
  PRIMARY KEY (`salesid`),
  foreign key (productcode) references products(productcode),
  foreign key (customercode) references customers(customercode),
  foreign key (soldby) references users(username)
  /* this below line is valid only if in sales info, we track which user from users table made the most sales */
) ENGINE=InnoDB AUTO_INCREMENT=2013 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `salesinfo`
--

LOCK TABLES `salesinfo` WRITE;
INSERT INTO `salesinfo` VALUES
(1, '2023-04-05', 'FMCG0001', 'vip1', 5, 100.0, 'tannaSpons'),
(2, '2023-04-06', 'FMCG0005', 'vip2', 3, 54.0, 'stduser1'),
(3, '2023-04-07', 'FMCG0010', 'std1', 10, 2500.0, 'root'),
(4, '2023-04-08', 'FMCG0009', 'std2', 2, 34.0, 'emp1'),
(5, '2023-04-09', 'FMCG0011', 'vip3', 7, 1400.0, 'tannaSpons'),
(6, '2023-04-10', 'FMCG0004', 'std3', 20, 400.0, 'stduser1'),
(7, '2023-04-11', 'FMCG0007', 'std5', 15, 180.0, 'root'),
(8, '2023-04-12', 'FMCG0022', 'vip1', 4, 740.0, 'emp1'),
(9, '2023-04-13', 'FMCG0024', 'vip2', 10, 1100.0, 'tannaSpons'),
(10, '2023-04-14', 'FMCG0004', 'std1', 8, 160.0, 'stduser1'),
(11, '2023-04-15', 'FMCG0049', 'std2', 12, 660.0, 'root'),
(12, '2023-04-16', 'FMCG0019', 'vip3', 14, 1820.0, 'emp1'),
(13, '2023-04-17', 'FMCG0021', 'std3', 18, 4500.0, 'tannaSpons'),
(14, '2023-04-18', 'FMCG0043', 'std5', 5, 200.0, 'stduser1'),
(15, '2023-04-19', 'FMCG0031', 'vip1', 30, 450.0, 'root'),
(16, '2023-04-20', 'FMCG0040', 'vip2', 25, 1500.0, 'emp1'),
(17, '2023-04-21', 'FMCG0005', 'std1', 40, 720.0, 'tannaSpons'),
(18, '2023-04-22', 'FMCG0050', 'std2', 55, 1100.0, 'stduser1'),
(19, '2023-04-23', 'FMCG0020', 'vip3', 65, 15600.0, 'root'),
(20, '2023-04-24', 'FMCG0030', 'std3', 40, 1000.0, 'emp1')
;
UNLOCK TABLES;




