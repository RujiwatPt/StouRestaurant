-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 11, 2021 at 12:04 AM
-- Server version: 10.4.19-MariaDB
-- PHP Version: 8.0.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `stourestaurant`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_bill`
--

CREATE TABLE `tb_bill` (
  `bill_id` varchar(12) NOT NULL,
  `mem_id` varchar(12) NOT NULL,
  `staff_id` varchar(12) NOT NULL,
  `order_id` varchar(12) NOT NULL,
  `bill_status` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_bill`
--

INSERT INTO `tb_bill` (`bill_id`, `mem_id`, `staff_id`, `order_id`, `bill_status`) VALUES
('B0001', 'A01', 'S01', 'O001', 'รอการชำระเงิน'),
('B0002', 'A02', 'S02', 'O002', 'ชำระเงินเสร็จสิ้น');

-- --------------------------------------------------------

--
-- Table structure for table `tb_food`
--

CREATE TABLE `tb_food` (
  `food_id` varchar(12) NOT NULL,
  `food_name` varchar(25) NOT NULL,
  `food_cost` int(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_food`
--

INSERT INTO `tb_food` (`food_id`, `food_name`, `food_cost`) VALUES
('F01', 'Food1', 50),
('F02', 'Food2', 60);

-- --------------------------------------------------------

--
-- Table structure for table `tb_member`
--

CREATE TABLE `tb_member` (
  `mem_id` varchar(12) NOT NULL,
  `mem_name` varchar(25) NOT NULL,
  `mem_phone` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_member`
--

INSERT INTO `tb_member` (`mem_id`, `mem_name`, `mem_phone`) VALUES
('A01', 'Test Member', '01-222-3333'),
('A02', 'Test Again', '02-111-8888'),
('A03', 'ทดลอง ใส่ข้อมูล', '04-444-4455');

-- --------------------------------------------------------

--
-- Table structure for table `tb_order`
--

CREATE TABLE `tb_order` (
  `order_id` varchar(12) NOT NULL,
  `table_id` varchar(12) NOT NULL,
  `food_id` varchar(12) NOT NULL,
  `amount` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_order`
--

INSERT INTO `tb_order` (`order_id`, `table_id`, `food_id`, `amount`) VALUES
('O001', 'T01', 'F01', 2),
('O002', 'T02', 'F02', 3);

-- --------------------------------------------------------

--
-- Table structure for table `tb_staff`
--

CREATE TABLE `tb_staff` (
  `staff_id` varchar(12) NOT NULL,
  `staff_name` varchar(25) NOT NULL,
  `staff_phone` varchar(12) NOT NULL,
  `staff_pos` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_staff`
--

INSERT INTO `tb_staff` (`staff_id`, `staff_name`, `staff_phone`, `staff_pos`) VALUES
('S01', 'Test Man', '01-111-1155', 'Test'),
('S02', 'Test Man2', '01-111-1177', 'Test2'),
('S03', 'Test Man3', '01-111-1111', 'Test3');

-- --------------------------------------------------------

--
-- Table structure for table `tb_table`
--

CREATE TABLE `tb_table` (
  `table_id` varchar(12) NOT NULL,
  `table_status` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tb_table`
--

INSERT INTO `tb_table` (`table_id`, `table_status`) VALUES
('T01', 'UNSEATED'),
('T02', 'SEATED');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_bill`
--
ALTER TABLE `tb_bill`
  ADD PRIMARY KEY (`bill_id`),
  ADD KEY `fk_staff_id` (`staff_id`),
  ADD KEY `fk_order_id` (`order_id`),
  ADD KEY `mem_id` (`mem_id`);

--
-- Indexes for table `tb_food`
--
ALTER TABLE `tb_food`
  ADD PRIMARY KEY (`food_id`);

--
-- Indexes for table `tb_member`
--
ALTER TABLE `tb_member`
  ADD PRIMARY KEY (`mem_id`);

--
-- Indexes for table `tb_order`
--
ALTER TABLE `tb_order`
  ADD PRIMARY KEY (`order_id`),
  ADD KEY `FK_table_id` (`table_id`),
  ADD KEY `fk_food_id` (`food_id`);

--
-- Indexes for table `tb_staff`
--
ALTER TABLE `tb_staff`
  ADD PRIMARY KEY (`staff_id`);

--
-- Indexes for table `tb_table`
--
ALTER TABLE `tb_table`
  ADD PRIMARY KEY (`table_id`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tb_bill`
--
ALTER TABLE `tb_bill`
  ADD CONSTRAINT `tb_bill_ibfk_1` FOREIGN KEY (`mem_id`) REFERENCES `tb_member` (`mem_id`),
  ADD CONSTRAINT `tb_bill_ibfk_2` FOREIGN KEY (`order_id`) REFERENCES `tb_order` (`order_id`),
  ADD CONSTRAINT `tb_bill_ibfk_3` FOREIGN KEY (`staff_id`) REFERENCES `tb_staff` (`staff_id`);

--
-- Constraints for table `tb_order`
--
ALTER TABLE `tb_order`
  ADD CONSTRAINT `tb_order_ibfk_1` FOREIGN KEY (`table_id`) REFERENCES `tb_table` (`table_id`),
  ADD CONSTRAINT `tb_order_ibfk_2` FOREIGN KEY (`food_id`) REFERENCES `tb_food` (`food_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
