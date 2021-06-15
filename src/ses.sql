-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 15, 2021 at 12:24 PM
-- Server version: 10.4.19-MariaDB
-- PHP Version: 8.0.7

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
  `studID` bigint(20) NOT NULL DEFAULT 2021,
  `password` varchar(150) NOT NULL DEFAULT '2021',
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
  `ave` varchar(5) NOT NULL,
  `course` varchar(250) NOT NULL DEFAULT 'none',
  `college` varchar(150) NOT NULL DEFAULT 'college',
  `regStatus` varchar(150) NOT NULL DEFAULT 'Regular',
  `studType` varchar(150) NOT NULL DEFAULT 'New',
  `yrlvl` int(150) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `schedules`
--

CREATE TABLE `schedules` (
  `subjectCode` varchar(20) NOT NULL,
  `section` int(10) NOT NULL,
  `subjectTitle` varchar(50) NOT NULL,
  `units` int(3) NOT NULL,
  `days` varchar(5) NOT NULL,
  `time` varchar(30) NOT NULL,
  `room` varchar(10) NOT NULL,
  `sets` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `schedules`
--

INSERT INTO `schedules` (`subjectCode`, `section`, `subjectTitle`, `units`, `days`, `time`, `room`, `sets`) VALUES
('AAP 0007', 33, 'Art Appreciation', 3, 'W', '8:30-11:30 am', 'FIELD', 1),
('BIO 1201', 4, 'Systematics (Lec)', 3, 'W/Th', '1:00-3:00 pm/1:00-3:00 pm', 'FIELD', 3),
('BIO 1201L', 4, 'Systematics (Lab)', 2, 'M/T', '4:00-8:00 pm/4:00-8:00 pm', 'FIELD', 3),
('CBM 0018', 5, 'Mathematics of Investment', 3, 'W', '6:00-8:00 pm', 'FIELD', 4),
('CET 0111', 3, 'Calculus 1', 3, 'F/S', '5:00-7:00 pm/5:00-7:00 pm', 'FIELD', 2),
('CET 0114', 3, 'General Chemistry (lec)', 3, 'F/S', '7:00-9:00 am/7:00-9:00 am', 'FIELD', 2),
('CET 0114.1', 3, 'General Chemistry (lab)', 1, 'F/S', '9:00-11:00 am/9:00-11:00 am', 'FIELD', 2),
('CHB 1201', 4, 'Chemical Biology (Organic Molecules) (Lec)', 2, 'W', '7:00-9:40 am', 'FIELD', 3),
('CHB 1201L', 4, 'Chemical Biology (Organic Molecules) (Lab)', 1, 'W/Th', '10:00-12:00 pm/10:00-12:00 pm', 'FIELD', 3),
('EIT 0102.1A', 3, 'Introduction to Computer Human Interaction (lab)', 1, 'W/Th', '3:00-5:00 pm/3:00-5:00 pm', 'FIELD', 2),
('EIT 0121', 3, 'Introduction to Computer Human Interaction (lec)', 2, 'W/Th', '1:00-2:20 pm/1:00-2:20 pm', 'FIELD', 2),
('EIT 0122', 3, 'Discrete Mathematics', 3, 'M/T', '1:00-3:00 pm/1:00-3:00 pm', 'FIELD', 2),
('EIT 0123', 3, 'Web Systems Technology (lec)', 2, 'W/Th', '7:00-8:20 am/7:00-8:20 am', 'FIELD', 2),
('EIT 0123.1', 3, 'Web Systems Technology (lab)', 1, 'W/Th', '9:00-11:00 am/9:00-11:00 am', 'FIELD', 2),
('ETH 0008', 49, 'Ethics', 3, 'M', '6:00-8:00 pm', 'FIELD', 4),
('GTB 121', 16, 'Great Books', 3, 'F/S', '1:00-3:00 pm/1:00-3:00 pm', 'FIELD', 2),
('ICC 0101', 8, 'Introduction to Computing (Lec)', 2, 'S', '7:00-9:00 am', 'FIELD', 1),
('ICC 0101.1', 8, 'Introduction to Computing (Lab)', 1, 'S', '9:00-12:00 pm', 'FIELD', 1),
('ICC 0102', 8, 'Fundamentals of Programming (lec)', 2, 'F', '7:00-9:00 am', 'FIELD', 1),
('ICC 0102.1', 8, 'Fundamentals of Programming (lab)', 1, 'F', '9:00-12:00 pm', 'FIELD', 1),
('ICC 0103', 8, 'Intermediate Programming (Lec)', 2, 'M/T', '7:00-8:20 am/7:00-8:20 am', 'FIELD', 2),
('ICC 0103.1', 8, 'Intermediate Programming (Lab)', 1, 'M/T', '9:00-11:00 am/9:00-11:00 am', 'FIELD', 2),
('IPP 0010', 6, 'Interdisiplinaryong Pagbasa at Pagsulat', 3, 'M', '9:00-12:00 pm', 'FIELD', 1),
('MMW 0001', 27, 'Mathematics in the Modern World', 3, 'T', '9:00-12:00 pm', 'FIELD', 1),
('NSTP 01', 90, 'National Service Training Program 1 (CWTS/ROTC)', 3, 'Su', '11:00-2:00 pm', 'FIELD', 1),
('NSTP 02', 22, 'National Service Training Program 2 (CWTS/ROTC)', 3, 'Su/Su', '9:00-11:00 am/4:00-6:00 pm', 'FIELD', 2),
('PCM 0006', 17, 'Purposive Communications', 3, 'M', '1:00-4:00 pm', 'FIELD', 1),
('PED 0001', 37, 'Foundation of Physical Activities', 2, 'T', '3:00-5:00 pm', 'FIELD', 1),
('PED 0012', 16, 'Group Exercise', 2, 'T', '4:00-6:40 pm', 'FIELD', 2),
('PED 0023', 5, 'Foreign FolkDance', 2, 'F', '7:00-9:40 pm', 'FIELD', 3),
('PIC 112', 4, 'Philippine Indigenous Communities', 3, 'F/S', '3:00-5:00 pm/3:00-5:00 pm', 'FIELD', 3),
('STB 1201', 4, 'Statistical Biology (Lec)', 2, 'T', '10:00-12:40 pm', 'FIELD', 3),
('STB 1201L', 4, 'Statistical Biology (Lab)', 1, 'M/T', '1:00-3:00 pm/1:00-3:00 pm', 'FIELD', 3),
('STS 0002', 55, 'Science, Technology and Society', 3, 'W', '4:30-7:30 pm', 'FIELD', 1),
('UTS 0003', 4, 'Understanding the Self', 3, 'M/T', '7:00-9:00 am/7:00-9:00 am', 'FIELD', 3);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `personalinfo`
--
ALTER TABLE `personalinfo`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `schedules`
--
ALTER TABLE `schedules`
  ADD PRIMARY KEY (`subjectCode`);

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
