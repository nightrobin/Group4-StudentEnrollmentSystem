-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 07, 2021 at 03:50 PM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ses`
--

-- --------------------------------------------------------

--
-- Table structure for table `personalinfo`
--

CREATE TABLE `personalinfo` (
  `id` int(11) NOT NULL,
  `lastname` varchar(45) NOT NULL,
  `firstname` varchar(45) NOT NULL,
  `middlename` varchar(45) NOT NULL,
  `nExtension` text NOT NULL,
  `lrn` bigint(12) NOT NULL,
  `seks` varchar(11) NOT NULL,
  `birthdate` varchar(12) NOT NULL,
  `age` int(2) NOT NULL,
  `address` text NOT NULL,
  `height` int(5) NOT NULL,
  `citizenship` varchar(50) NOT NULL,
  `weight` int(5) NOT NULL,
  `religion` varchar(150) NOT NULL,
  `civil_status` varchar(150) NOT NULL,
  `cpnum` int(15) NOT NULL,
  `email` varchar(150) NOT NULL,
  `fathername` varchar(250) NOT NULL,
  `mothername` varchar(250) NOT NULL,
  `fathernum` int(15) NOT NULL,
  `mothernum` int(15) NOT NULL,
  `gname` varchar(150) NOT NULL,
  `gnum` int(15) NOT NULL,
  `schcategory` varchar(150) NOT NULL,
  `lschname` varchar(250) NOT NULL,
  `lschadd` text NOT NULL,
  `ave` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `personalinfo`
--
ALTER TABLE `personalinfo`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `personalinfo`
--
ALTER TABLE `personalinfo`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
