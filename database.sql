-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 19, 2014 at 06:59 PM
-- Server version: 5.5.27
-- PHP Version: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `kotisoft`
--

-- --------------------------------------------------------

--
-- Table structure for table `tickets`
--

CREATE TABLE IF NOT EXISTS `tickets` (
  `Name` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `model` varchar(50) NOT NULL,
  `problem` varchar(150) NOT NULL,
  `cost` varchar(50) DEFAULT '500',
  `status` varchar(50) DEFAULT 'incomplete'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tickets`
--

INSERT INTO `tickets` (`Name`, `email`, `model`, `problem`, `cost`, `status`) VALUES
('Anshul Gadkari', 'tejasghalsasi@gmail.com', 'koti A110', 'My battery is dead its not working well', '500', 'complete'),
('pankaj yadav', 'pankaj@gmail.com', 'k110', 'battery deadd', '500', 'incomplete'),
('rahul gandhi', 'congressibachha@gmail.com', 'k110', 'speaker not working', '500', 'complete'),
('Anshul', 'anshul@gmail.com', 'K110', 'Display not working', '500', 'complete ,sending boy to get payment'),
('Anshul', 'anshul@gmail.com', 'k110', 'Display not working', '500', 'incomplete');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
