-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 15, 2022 at 04:58 PM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `podcast`
--

-- --------------------------------------------------------

--
-- Table structure for table `speakers`
--

CREATE TABLE `speakers` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `location` varchar(255) NOT NULL,
  `speaker` varchar(255) NOT NULL,
  `title` varchar(255) NOT NULL,
  `category` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `speakers`
--

INSERT INTO `speakers` (`id`, `name`, `location`, `speaker`, `title`, `category`) VALUES
(1, 'Super Cow.mp3', 'audios/Super Cow.mp3', '', '', ''),
(3, 'Eat Your Vegetables.mp3', 'audios/Eat Your Vegetables.mp3', '', '', ''),
(4, 'Green Tea Audio.mp3', 'audios/Green Tea Audio.mp3', '', '', ''),
(5, 'Man Injured Audio.mp3', 'audios/Man Injured Audio.mp3', '', '', ''),
(6, 'Green Tea Audio.mp3', 'audios/Green Tea Audio.mp3', '', '', ''),
(7, 'Man Injured MS I.mp3', 'audios/Man Injured MS I.mp3', '', '', ''),
(9, 'Man Injured Audio.mp3', 'audios/Man Injured Audio.mp3', '', '', ''),
(10, 'Man Injured Audio.mp3', 'audios/Man Injured Audio.mp3', '', '', '');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `speakers`
--
ALTER TABLE `speakers`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `speakers`
--
ALTER TABLE `speakers`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
