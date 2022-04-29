-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 27, 2022 at 02:03 PM
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
  `category` varchar(255) NOT NULL,
  `sub_category` varchar(255) NOT NULL,
  `image` varchar(60) NOT NULL,
  `create_date` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `speakers`
--

INSERT INTO `speakers` (`id`, `name`, `location`, `speaker`, `title`, `category`, `sub_category`, `image`, `create_date`) VALUES
(1, 'خطبة الجمعة20-10-2017 أنقذوا أحلام الشباب ؟! للداعية ! محمود الحسنات.mp3', 'audios/خطبة الجمعة20-10-2017 أنقذوا أحلام الشباب ؟! للداعية ! محمود الحسنات.mp3', 'الشيخ محمود الحسنات', 'أنقذوا أحلام الشباب', 'محمود الحسنات', 'friday_khutbah', '62691a9157a2f.png', '2022-04-27 10:27:29'),
(2, 'نحن اعداء انفسنا - خطبة الجمعة 10-11-2017 ! الداعية ! محمود الحسنات.mp3', 'audios/نحن اعداء انفسنا - خطبة الجمعة 10-11-2017 ! الداعية ! محمود الحسنات.mp3', 'الشيخ محمود الحسنات', 'نحن اعداء انفسنا', 'محمود الحسنات', 'friday_khutbah', '62691ac710c21.png', '2022-04-27 10:28:23'),
(3, 'لا تزوج ابنتك قبل أن تستمع لهذه الكلمات - كلمات مهمة ومؤلمة للداعية ! محمود الحسنات.mp3', 'audios/لا تزوج ابنتك قبل أن تستمع لهذه الكلمات - كلمات مهمة ومؤلمة للداعية ! محمود الحسنات.mp3', 'الشيخ محمود الحسنات', 'لا تزوج ابنتك قبل أن تستمع لهذه الكلمات', 'محمود الحسنات', 'Lessons_lectures', '62691b3782bcb.png', '2022-04-27 10:30:15'),
(4, 'هل الله يبتليني لإنه يكرهني؟ - كلمات ستعيد لقلبك الحياة للداعية ! محمود الحسنات.mp3', 'audios/هل الله يبتليني لإنه يكرهني؟ - كلمات ستعيد لقلبك الحياة للداعية ! محمود الحسنات.mp3', 'الشيخ محمود الحسنات', 'هل الله يبتليني لإنه يكرهني؟', 'محمود الحسنات', 'Lessons_lectures', '62691b69ecb10.png', '2022-04-27 10:31:05'),
(5, 'ارحموهم كي يرحمكم من في السماء ! كلمات تبكي الحجر للداعية ! محمود الحسنات.mp3', 'audios/ارحموهم كي يرحمكم من في السماء ! كلمات تبكي الحجر للداعية ! محمود الحسنات.mp3', 'الشيخ محمود الحسنات', 'ارحموهم كي يرحمكم من في السماء ! ', 'محمود الحسنات', 'audio_influential', '62691ba96508e.png', '2022-04-27 10:32:09'),
(6, 'الآباء لا يعودون - كلمات مبكية من خطبة الجمعة بعد وفاة والد الداعية ! محمود الحسنات.mp3', 'audios/الآباء لا يعودون - كلمات مبكية من خطبة الجمعة بعد وفاة والد الداعية ! محمود الحسنات.mp3', 'الشيخ محمود الحسنات', 'الآباء لا يعودون', 'محمود الحسنات', 'audio_influential', '62691bf0c001c.png', '2022-04-27 10:33:20');

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
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
