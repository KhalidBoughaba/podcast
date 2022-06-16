-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 16, 2022 at 10:28 AM
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
-- Table structure for table `audio`
--

CREATE TABLE `audio` (
  `id` int(11) NOT NULL,
  `title` varchar(100) NOT NULL,
  `location` varchar(100) NOT NULL,
  `IDcategory` int(11) NOT NULL,
  `IDspeaker` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `audio`
--

INSERT INTO `audio` (`id`, `title`, `location`, `IDcategory`, `IDspeaker`) VALUES
(1, 'أنقذوا أحلام الشباب', 'audios/خطبة الجمعة20-10-2017 أنقذوا أحلام الشباب ؟...', 1, 1),
(2, 'نحن اعداء انفسنا', 'audios/نحن اعداء انفسنا - خطبة الجمعة 10-11-2017 !...', 1, 1),
(3, 'لا تزوج ابنتك قبل أن تستمع لهذه الكلمات', 'audios/لا تزوج ابنتك قبل أن تستمع لهذه الكلمات - كلمات مهمة ومؤلمة للداعية ! محمود الحسنات.mp3', 2, 1),
(4, 'هل الله يبتليني لإنه يكرهني؟', 'audios/هل الله يبتليني لإنه يكرهني؟ - كلمات ستعيد لقلبك الحياة للداعية ! محمود الحسنات.mp3', 2, 1),
(5, 'ارحموهم كي يرحمكم من في السماء ! ', 'audios/ارحموهم كي يرحمكم من في السماء ! كلمات تبكي الحجر للداعية ! محمود الحسنات.mp3', 3, 1),
(6, 'الآباء لا يعودون', 'audios/الآباء لا يعودون - كلمات مبكية من خطبة الجمعة بعد وفاة والد الداعية ! محمود الحسنات.mp3', 3, 1),
(7, 'ستتخلصّ من \' الــكـسـل \' بعد سماعك لهذا المقطع', 'audios/ستتخلصّ من \' الــكـسـل \' بعد سماعك لهذا المقطع ـ من روائع الشيخ سعيد الكملي.mp3', 2, 2),
(8, 'لماذا تحدث للمسلمين كل هذه الابتلاءات؟', 'audios/سؤال! لماذا تحدث للمسلمين كل هذه الابتلاءات؟.mp3', 2, 3),
(9, 'أرى أنني إنسان فاشل.. فلا أستطيع الإقدام على أي شيء.. فما الحل؟', 'audios/أرى أنني إنسان فاشل.. فلا أستطيع الإقدام على أي شيء.. فما الحل؟ ! ذ. ياسين العمري.mp3', 2, 4);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `audio`
--
ALTER TABLE `audio`
  ADD PRIMARY KEY (`id`),
  ADD KEY `IDspeaker` (`IDspeaker`),
  ADD KEY `IDcategory` (`IDcategory`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `audio`
--
ALTER TABLE `audio`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `audio`
--
ALTER TABLE `audio`
  ADD CONSTRAINT `audio_ibfk_1` FOREIGN KEY (`IDspeaker`) REFERENCES `speaker` (`id`),
  ADD CONSTRAINT `audio_ibfk_2` FOREIGN KEY (`IDcategory`) REFERENCES `category` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
