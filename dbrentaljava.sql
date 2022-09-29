-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 12, 2022 at 07:52 AM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbrentaljava`
--

-- --------------------------------------------------------

--
-- Table structure for table `cartable`
--

CREATE TABLE `cartable` (
  `License_plateid` varchar(50) NOT NULL,
  `Status` varchar(25) NOT NULL,
  `Brand` varchar(50) NOT NULL,
  `Production` varchar(50) NOT NULL,
  `Type` varchar(50) NOT NULL,
  `Color` varchar(50) NOT NULL,
  `Price` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `cartable`
--

INSERT INTO `cartable` (`License_plateid`, `Status`, `Brand`, `Production`, `Type`, `Color`, `Price`) VALUES
('A 8392 SS', 'y', 'Toyota', '2015', 'Avanza', 'Black', '450000'),
('A 8HS2 SS', 'y', 'Daihatsu', '2014', 'Xenia', 'Red', '350000'),
('B 8498 KF', 'n', 'Toyota', '2011', 'Avanza', 'White', '300000'),
('D 2929 SKS', 'y', 'Honda', '2015', 'Freed', 'Black', '300000');

-- --------------------------------------------------------

--
-- Table structure for table `cartransaction`
--

CREATE TABLE `cartransaction` (
  `Order_id` varchar(50) NOT NULL,
  `Order_name` varchar(50) NOT NULL,
  `License_plateid` varchar(50) NOT NULL,
  `Brand` varchar(50) NOT NULL,
  `Production` varchar(50) NOT NULL,
  `Type` varchar(50) NOT NULL,
  `Color` varchar(50) NOT NULL,
  `Loan_date` date NOT NULL,
  `Date_of_return` date NOT NULL,
  `Price` varchar(50) NOT NULL,
  `Status` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `cartransaction`
--

INSERT INTO `cartransaction` (`Order_id`, `Order_name`, `License_plateid`, `Brand`, `Production`, `Type`, `Color`, `Loan_date`, `Date_of_return`, `Price`, `Status`) VALUES
('OD001', 'Fahri', 'B 8498 KF', 'Toyota', '2011', 'Avanza', 'White', '2022-05-20', '2022-05-23', '300000', 'y');

-- --------------------------------------------------------

--
-- Table structure for table `customerinput`
--

CREATE TABLE `customerinput` (
  `Ktp_id` varchar(50) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Phone_number` varchar(50) NOT NULL,
  `Address` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customerinput`
--

INSERT INTO `customerinput` (`Ktp_id`, `Name`, `Phone_number`, `Address`) VALUES
('3523929393849384', 'Rafli', '082392839283', 'Bandung'),
('3608328282388274', 'Fahri', '089128382838', 'Medan'),
('3694892384902394', 'Devandra ', '088238274387', 'Tangerang'),
('3985495894959453', 'Karen', '084237483294', 'Jaksel');

-- --------------------------------------------------------

--
-- Table structure for table `formregister`
--

CREATE TABLE `formregister` (
  `Id` varchar(50) NOT NULL,
  `Username` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `formregister`
--

INSERT INTO `formregister` (`Id`, `Username`, `Password`) VALUES
('AD001', 'admin', '1234'),
('AD002', 'Devandra', '1234'),
('AD003', 'Rafli', '12345'),
('AD004', 'Karen', '5432'),
('AD005', 'Siapasaja', '1234'),
('AD006', 'fahri', '1234');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cartable`
--
ALTER TABLE `cartable`
  ADD PRIMARY KEY (`License_plateid`);

--
-- Indexes for table `cartransaction`
--
ALTER TABLE `cartransaction`
  ADD PRIMARY KEY (`Order_id`),
  ADD KEY `License_plateid` (`License_plateid`);

--
-- Indexes for table `customerinput`
--
ALTER TABLE `customerinput`
  ADD PRIMARY KEY (`Ktp_id`);

--
-- Indexes for table `formregister`
--
ALTER TABLE `formregister`
  ADD PRIMARY KEY (`Id`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `cartransaction`
--
ALTER TABLE `cartransaction`
  ADD CONSTRAINT `cartransaction_ibfk_1` FOREIGN KEY (`License_plateid`) REFERENCES `cartable` (`License_plateid`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
