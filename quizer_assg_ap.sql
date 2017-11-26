-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 26, 2017 at 02:54 PM
-- Server version: 10.1.25-MariaDB
-- PHP Version: 7.1.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `quizer_assg_ap`
--

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequences`
--

CREATE TABLE `hibernate_sequences` (
  `sequence_name` varchar(255) NOT NULL,
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hibernate_sequences`
--

INSERT INTO `hibernate_sequences` (`sequence_name`, `next_val`) VALUES
('default', 166);

-- --------------------------------------------------------

--
-- Table structure for table `question`
--

CREATE TABLE `question` (
  `id` int(11) NOT NULL,
  `expectedans` varchar(255) DEFAULT NULL,
  `options` tinyblob,
  `text` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `question`
--

INSERT INTO `question` (`id`, `expectedans`, `options`, `text`, `type`) VALUES
(2, '2', NULL, '1+1=?', 'Numeric'),
(3, '-1', NULL, '1-2=?', 'Numeric'),
(4, '7', NULL, '2+5=?', 'Numeric'),
(5, 'True', NULL, '1+2=3', 'True/False'),
(6, 'True', NULL, '5-2=3', 'True/False'),
(7, 'True', NULL, '5+2-6=1', 'True/False'),
(8, 'True', NULL, '1-2=-1', 'True/False'),
(9, 'True', NULL, '4-2=2', 'True/False'),
(10, 'True', NULL, '6-1=5', 'True/False'),
(11, 'True', NULL, '4-1=3', 'True/False'),
(13, 'option 1', 0xaced0005757200135b4c6a6176612e6c616e672e537472696e673badd256e7e91d7b470200007870000000047400086f7074696f6e20317400086f7074696f6e20327400086f7074696f6e20337400086f7074696f6e2034, 'Example question mcq', 'MCQ'),
(14, 'option 1', 0xaced0005757200135b4c6a6176612e6c616e672e537472696e673badd256e7e91d7b470200007870000000047400086f7074696f6e20317400086f7074696f6e20327400086f7074696f6e20337400086f7074696f6e2034, 'Example question mcq', 'MCQ'),
(15, 'option 1', 0xaced0005757200135b4c6a6176612e6c616e672e537472696e673badd256e7e91d7b470200007870000000047400086f7074696f6e20317400086f7074696f6e20327400086f7074696f6e20337400086f7074696f6e2034, 'Example question mcq', 'MCQ'),
(16, 'option 1', 0xaced0005757200135b4c6a6176612e6c616e672e537472696e673badd256e7e91d7b470200007870000000047400086f7074696f6e20317400086f7074696f6e20327400086f7074696f6e20337400086f7074696f6e2034, 'Example question mcq', 'MCQ'),
(17, 'option 1', 0xaced0005757200135b4c6a6176612e6c616e672e537472696e673badd256e7e91d7b470200007870000000047400086f7074696f6e20317400086f7074696f6e20327400086f7074696f6e20337400086f7074696f6e2034, 'Example question mcq', 'MCQ'),
(18, 'option 1', 0xaced0005757200135b4c6a6176612e6c616e672e537472696e673badd256e7e91d7b470200007870000000047400086f7074696f6e20317400086f7074696f6e20327400086f7074696f6e20337400086f7074696f6e2034, 'Example question mcq', 'MCQ'),
(19, 'option 1', 0xaced0005757200135b4c6a6176612e6c616e672e537472696e673badd256e7e91d7b470200007870000000047400086f7074696f6e20317400086f7074696f6e20327400086f7074696f6e20337400086f7074696f6e2034, 'Example question mcq', 'MCQ'),
(20, 'option 1', 0xaced0005757200135b4c6a6176612e6c616e672e537472696e673badd256e7e91d7b470200007870000000047400086f7074696f6e20317400086f7074696f6e20327400086f7074696f6e20337400086f7074696f6e2034, 'Example question mcq', 'MCQ'),
(21, 'option 1', 0xaced0005757200135b4c6a6176612e6c616e672e537472696e673badd256e7e91d7b470200007870000000047400086f7074696f6e20317400086f7074696f6e20327400086f7074696f6e20337400086f7074696f6e2034, 'Example question mcq', 'MCQ'),
(22, 'option 1', 0xaced0005757200135b4c6a6176612e6c616e672e537472696e673badd256e7e91d7b470200007870000000047400086f7074696f6e20317400086f7074696f6e20327400086f7074696f6e20337400086f7074696f6e2034, 'Example question mcq', 'MCQ'),
(24, 'True', NULL, 'Example question true false type true', 'True/False'),
(25, 'True', NULL, 'Example question true false type true', 'True/False'),
(26, 'True', NULL, 'Example question true false type true', 'True/False'),
(27, 'True', NULL, 'Example question true false type true', 'True/False'),
(28, 'True', NULL, 'Example question true false type true', 'True/False'),
(29, 'True', NULL, 'Example question true false type true', 'True/False'),
(30, 'True', NULL, 'Example question true false type true', 'True/False'),
(31, 'True', NULL, 'Example question true false type true', 'True/False'),
(32, 'True', NULL, 'Example question true false type true', 'True/False'),
(33, 'True', NULL, 'Example question true false type true', 'True/False'),
(35, '1', NULL, 'Numeric example question', 'Numeric'),
(36, '1', NULL, 'Numeric example question', 'Numeric'),
(37, '1', NULL, 'Numeric example question', 'Numeric'),
(38, '1', NULL, 'Numeric example question', 'Numeric'),
(39, '1', NULL, 'Numeric example question', 'Numeric'),
(40, '1', NULL, 'Numeric example question', 'Numeric'),
(41, '1', NULL, 'Numeric example question', 'Numeric'),
(42, '1', NULL, 'Numeric example question', 'Numeric'),
(43, '1', NULL, 'Numeric example question', 'Numeric'),
(44, '1', NULL, 'Numeric example question', 'Numeric'),
(46, 'option 1', 0xaced0005757200135b4c6a6176612e6c616e672e537472696e673badd256e7e91d7b470200007870000000047400086f7074696f6e20317400086f7074696f6e20327400086f7074696f6e20337400086f7074696f6e2034, 'Example question mcq', 'MCQ'),
(47, 'True', NULL, 'Example question true false type true', 'True/False'),
(48, '1', NULL, 'Numeric example question', 'Numeric'),
(49, 'option 1', 0xaced0005757200135b4c6a6176612e6c616e672e537472696e673badd256e7e91d7b470200007870000000047400086f7074696f6e20317400086f7074696f6e20327400086f7074696f6e20337400086f7074696f6e2034, 'Example question mcq', 'MCQ'),
(50, 'True', NULL, 'Example question true false type true', 'True/False'),
(51, '1', NULL, 'Numeric example question', 'Numeric'),
(52, 'option 1', 0xaced0005757200135b4c6a6176612e6c616e672e537472696e673badd256e7e91d7b470200007870000000047400086f7074696f6e20317400086f7074696f6e20327400086f7074696f6e20337400086f7074696f6e2034, 'Example question mcq', 'MCQ'),
(53, 'True', NULL, 'Example question true false type true', 'True/False'),
(54, '1', NULL, 'Numeric example question', 'Numeric'),
(55, '1', NULL, 'Numeric example question', 'Numeric'),
(57, 'option 1', 0xaced0005757200135b4c6a6176612e6c616e672e537472696e673badd256e7e91d7b470200007870000000047400086f7074696f6e20317400086f7074696f6e20327400086f7074696f6e20337400086f7074696f6e2034, 'Example question mcq', 'MCQ'),
(58, 'option 1', 0xaced0005757200135b4c6a6176612e6c616e672e537472696e673badd256e7e91d7b470200007870000000047400086f7074696f6e20317400086f7074696f6e20327400086f7074696f6e20337400086f7074696f6e2034, 'Example question mcq', 'MCQ'),
(59, 'option 1', 0xaced0005757200135b4c6a6176612e6c616e672e537472696e673badd256e7e91d7b470200007870000000047400086f7074696f6e20317400086f7074696f6e20327400086f7074696f6e20337400086f7074696f6e2034, 'Example question mcq', 'MCQ'),
(60, 'option 1', 0xaced0005757200135b4c6a6176612e6c616e672e537472696e673badd256e7e91d7b470200007870000000047400086f7074696f6e20317400086f7074696f6e20327400086f7074696f6e20337400086f7074696f6e2034, 'Example question mcq', 'MCQ'),
(61, 'option 1', 0xaced0005757200135b4c6a6176612e6c616e672e537472696e673badd256e7e91d7b470200007870000000047400086f7074696f6e20317400086f7074696f6e20327400086f7074696f6e20337400086f7074696f6e2034, 'Example question mcq', 'MCQ'),
(62, 'option 1', 0xaced0005757200135b4c6a6176612e6c616e672e537472696e673badd256e7e91d7b470200007870000000047400086f7074696f6e20317400086f7074696f6e20327400086f7074696f6e20337400086f7074696f6e2034, 'Example question mcq', 'MCQ'),
(63, 'option 1', 0xaced0005757200135b4c6a6176612e6c616e672e537472696e673badd256e7e91d7b470200007870000000047400086f7074696f6e20317400086f7074696f6e20327400086f7074696f6e20337400086f7074696f6e2034, 'Example question mcq', 'MCQ'),
(64, 'option 1', 0xaced0005757200135b4c6a6176612e6c616e672e537472696e673badd256e7e91d7b470200007870000000047400086f7074696f6e20317400086f7074696f6e20327400086f7074696f6e20337400086f7074696f6e2034, 'Example question mcq', 'MCQ'),
(65, 'option 1', 0xaced0005757200135b4c6a6176612e6c616e672e537472696e673badd256e7e91d7b470200007870000000047400086f7074696f6e20317400086f7074696f6e20327400086f7074696f6e20337400086f7074696f6e2034, 'Example question mcq', 'MCQ'),
(66, 'option 1', 0xaced0005757200135b4c6a6176612e6c616e672e537472696e673badd256e7e91d7b470200007870000000047400086f7074696f6e20317400086f7074696f6e20327400086f7074696f6e20337400086f7074696f6e2034, 'Example question mcq', 'MCQ'),
(68, 'True', NULL, 'Example question true false type true', 'True/False'),
(69, 'True', NULL, 'Example question true false type true', 'True/False'),
(70, 'True', NULL, 'Example question true false type true', 'True/False'),
(71, 'True', NULL, 'Example question true false type true', 'True/False'),
(72, 'True', NULL, 'Example question true false type true', 'True/False'),
(73, 'True', NULL, 'Example question true false type true', 'True/False'),
(74, 'True', NULL, 'Example question true false type true', 'True/False'),
(75, 'True', NULL, 'Example question true false type true', 'True/False'),
(76, 'True', NULL, 'Example question true false type true', 'True/False'),
(77, 'True', NULL, 'Example question true false type true', 'True/False'),
(79, 'option 1', 0xaced0005757200135b4c6a6176612e6c616e672e537472696e673badd256e7e91d7b470200007870000000047400086f7074696f6e20317400086f7074696f6e20327400086f7074696f6e20337400086f7074696f6e2034, 'Example question mcq', 'MCQ'),
(80, 'option 1', 0xaced0005757200135b4c6a6176612e6c616e672e537472696e673badd256e7e91d7b470200007870000000047400086f7074696f6e20317400086f7074696f6e20327400086f7074696f6e20337400086f7074696f6e2034, 'Example question mcq', 'MCQ'),
(81, 'option 1', 0xaced0005757200135b4c6a6176612e6c616e672e537472696e673badd256e7e91d7b470200007870000000047400086f7074696f6e20317400086f7074696f6e20327400086f7074696f6e20337400086f7074696f6e2034, 'Example question mcq', 'MCQ'),
(82, 'True', NULL, 'Example question true false type true', 'True/False'),
(83, 'True', NULL, 'Example question true false type true', 'True/False'),
(84, 'True', NULL, 'Example question true false type true', 'True/False'),
(85, 'True', NULL, 'Example question true false type true', 'True/False'),
(86, 'True', NULL, 'Example question true false type true', 'True/False'),
(87, 'True', NULL, 'Example question true false type true', 'True/False'),
(88, 'True', NULL, 'Example question true false type true', 'True/False'),
(90, 'option 1', 0xaced0005757200135b4c6a6176612e6c616e672e537472696e673badd256e7e91d7b470200007870000000047400086f7074696f6e20317400086f7074696f6e20327400086f7074696f6e20337400086f7074696f6e2034, 'Example question mcq', 'MCQ'),
(91, 'option 1', 0xaced0005757200135b4c6a6176612e6c616e672e537472696e673badd256e7e91d7b470200007870000000047400086f7074696f6e20317400086f7074696f6e20327400086f7074696f6e20337400086f7074696f6e2034, 'Example question mcq', 'MCQ'),
(92, 'option 1', 0xaced0005757200135b4c6a6176612e6c616e672e537472696e673badd256e7e91d7b470200007870000000047400086f7074696f6e20317400086f7074696f6e20327400086f7074696f6e20337400086f7074696f6e2034, 'Example question mcq', 'MCQ'),
(93, 'option 1', 0xaced0005757200135b4c6a6176612e6c616e672e537472696e673badd256e7e91d7b470200007870000000047400086f7074696f6e20317400086f7074696f6e20327400086f7074696f6e20337400086f7074696f6e2034, 'Example question mcq', 'MCQ'),
(94, 'option 1', 0xaced0005757200135b4c6a6176612e6c616e672e537472696e673badd256e7e91d7b470200007870000000047400086f7074696f6e20317400086f7074696f6e20327400086f7074696f6e20337400086f7074696f6e2034, 'Example question mcq', 'MCQ'),
(95, 'option 1', 0xaced0005757200135b4c6a6176612e6c616e672e537472696e673badd256e7e91d7b470200007870000000047400086f7074696f6e20317400086f7074696f6e20327400086f7074696f6e20337400086f7074696f6e2034, 'Example question mcq', 'MCQ'),
(96, 'option 1', 0xaced0005757200135b4c6a6176612e6c616e672e537472696e673badd256e7e91d7b470200007870000000047400086f7074696f6e20317400086f7074696f6e20327400086f7074696f6e20337400086f7074696f6e2034, 'Example question mcq', 'MCQ'),
(97, 'option 1', 0xaced0005757200135b4c6a6176612e6c616e672e537472696e673badd256e7e91d7b470200007870000000047400086f7074696f6e20317400086f7074696f6e20327400086f7074696f6e20337400086f7074696f6e2034, 'Example question mcq', 'MCQ'),
(98, 'option 1', 0xaced0005757200135b4c6a6176612e6c616e672e537472696e673badd256e7e91d7b470200007870000000047400086f7074696f6e20317400086f7074696f6e20327400086f7074696f6e20337400086f7074696f6e2034, 'Example question mcq', 'MCQ'),
(99, 'option 1', 0xaced0005757200135b4c6a6176612e6c616e672e537472696e673badd256e7e91d7b470200007870000000047400086f7074696f6e20317400086f7074696f6e20327400086f7074696f6e20337400086f7074696f6e2034, 'Example question mcq', 'MCQ'),
(101, 'option 1', 0xaced0005757200135b4c6a6176612e6c616e672e537472696e673badd256e7e91d7b470200007870000000047400086f7074696f6e20317400086f7074696f6e20327400086f7074696f6e20337400086f7074696f6e2034, 'Example question mcq', 'MCQ'),
(102, 'option 1', 0xaced0005757200135b4c6a6176612e6c616e672e537472696e673badd256e7e91d7b470200007870000000047400086f7074696f6e20317400086f7074696f6e20327400086f7074696f6e20337400086f7074696f6e2034, 'Example question mcq', 'MCQ'),
(103, 'option 1', 0xaced0005757200135b4c6a6176612e6c616e672e537472696e673badd256e7e91d7b470200007870000000047400086f7074696f6e20317400086f7074696f6e20327400086f7074696f6e20337400086f7074696f6e2034, 'Example question mcq', 'MCQ'),
(104, 'option 1', 0xaced0005757200135b4c6a6176612e6c616e672e537472696e673badd256e7e91d7b470200007870000000047400086f7074696f6e20317400086f7074696f6e20327400086f7074696f6e20337400086f7074696f6e2034, 'Example question mcq', 'MCQ'),
(105, '1', NULL, 'Numeric example question', 'Numeric'),
(106, '1', NULL, 'Numeric example question', 'Numeric'),
(107, '1', NULL, 'Numeric example question', 'Numeric'),
(108, '1', NULL, 'Numeric example question', 'Numeric'),
(109, '1', NULL, 'Numeric example question', 'Numeric'),
(110, '1', NULL, 'Numeric example question', 'Numeric'),
(112, 'option 1', 0xaced0005757200135b4c6a6176612e6c616e672e537472696e673badd256e7e91d7b470200007870000000047400086f7074696f6e20317400086f7074696f6e20327400086f7074696f6e20337400086f7074696f6e2034, 'Example question mcq', 'MCQ'),
(113, 'option 1', 0xaced0005757200135b4c6a6176612e6c616e672e537472696e673badd256e7e91d7b470200007870000000047400086f7074696f6e20317400086f7074696f6e20327400086f7074696f6e20337400086f7074696f6e2034, 'Example question mcq', 'MCQ'),
(114, 'option 1', 0xaced0005757200135b4c6a6176612e6c616e672e537472696e673badd256e7e91d7b470200007870000000047400086f7074696f6e20317400086f7074696f6e20327400086f7074696f6e20337400086f7074696f6e2034, 'Example question mcq', 'MCQ'),
(115, 'option 1', 0xaced0005757200135b4c6a6176612e6c616e672e537472696e673badd256e7e91d7b470200007870000000047400086f7074696f6e20317400086f7074696f6e20327400086f7074696f6e20337400086f7074696f6e2034, 'Example question mcq', 'MCQ'),
(116, 'option 1', 0xaced0005757200135b4c6a6176612e6c616e672e537472696e673badd256e7e91d7b470200007870000000047400086f7074696f6e20317400086f7074696f6e20327400086f7074696f6e20337400086f7074696f6e2034, 'Example question mcq', 'MCQ'),
(117, 'option 1', 0xaced0005757200135b4c6a6176612e6c616e672e537472696e673badd256e7e91d7b470200007870000000047400086f7074696f6e20317400086f7074696f6e20327400086f7074696f6e20337400086f7074696f6e2034, 'Example question mcq', 'MCQ'),
(118, 'option 1', 0xaced0005757200135b4c6a6176612e6c616e672e537472696e673badd256e7e91d7b470200007870000000047400086f7074696f6e20317400086f7074696f6e20327400086f7074696f6e20337400086f7074696f6e2034, 'Example question mcq', 'MCQ'),
(119, 'option 1', 0xaced0005757200135b4c6a6176612e6c616e672e537472696e673badd256e7e91d7b470200007870000000047400086f7074696f6e20317400086f7074696f6e20327400086f7074696f6e20337400086f7074696f6e2034, 'Example question mcq', 'MCQ'),
(120, 'option 1', 0xaced0005757200135b4c6a6176612e6c616e672e537472696e673badd256e7e91d7b470200007870000000047400086f7074696f6e20317400086f7074696f6e20327400086f7074696f6e20337400086f7074696f6e2034, 'Example question mcq', 'MCQ'),
(121, 'option 1', 0xaced0005757200135b4c6a6176612e6c616e672e537472696e673badd256e7e91d7b470200007870000000047400086f7074696f6e20317400086f7074696f6e20327400086f7074696f6e20337400086f7074696f6e2034, 'Example question mcq', 'MCQ'),
(123, 'True', NULL, 'Example question true false type true', 'True/False'),
(124, 'True', NULL, 'Example question true false type true', 'True/False'),
(125, 'True', NULL, 'Example question true false type true', 'True/False'),
(126, 'True', NULL, 'Example question true false type true', 'True/False'),
(127, 'True', NULL, 'Example question true false type true', 'True/False'),
(128, 'True', NULL, 'Example question true false type true', 'True/False'),
(129, 'True', NULL, 'Example question true false type true', 'True/False'),
(130, 'True', NULL, 'Example question true false type true', 'True/False'),
(131, 'True', NULL, 'Example question true false type true', 'True/False'),
(132, 'True', NULL, 'Example question true false type true', 'True/False'),
(134, '1', NULL, 'Numeric example question', 'Numeric'),
(135, '1', NULL, 'Numeric example question', 'Numeric'),
(136, '1', NULL, 'Numeric example question', 'Numeric'),
(137, '1', NULL, 'Numeric example question', 'Numeric'),
(138, '1', NULL, 'Numeric example question', 'Numeric'),
(139, '1', NULL, 'Numeric example question', 'Numeric'),
(140, '1', NULL, 'Numeric example question', 'Numeric'),
(141, '1', NULL, 'Numeric example question', 'Numeric'),
(142, '1', NULL, 'Numeric example question', 'Numeric'),
(143, '1', NULL, 'Numeric example question', 'Numeric'),
(145, 'option 1', 0xaced0005757200135b4c6a6176612e6c616e672e537472696e673badd256e7e91d7b470200007870000000047400086f7074696f6e20317400086f7074696f6e20327400086f7074696f6e20337400086f7074696f6e2034, 'Example question mcq', 'MCQ'),
(146, 'option 1', 0xaced0005757200135b4c6a6176612e6c616e672e537472696e673badd256e7e91d7b470200007870000000047400086f7074696f6e20317400086f7074696f6e20327400086f7074696f6e20337400086f7074696f6e2034, 'Example question mcq', 'MCQ'),
(147, 'True', NULL, 'Example question true false type true', 'True/False'),
(148, '1', NULL, 'Numeric example question', 'Numeric'),
(149, '1', NULL, 'Numeric example question', 'Numeric'),
(150, 'True', NULL, 'Example question true false type true', 'True/False'),
(151, 'option 1', 0xaced0005757200135b4c6a6176612e6c616e672e537472696e673badd256e7e91d7b470200007870000000047400086f7074696f6e20317400086f7074696f6e20327400086f7074696f6e20337400086f7074696f6e2034, 'Example question mcq', 'MCQ'),
(152, 'option 1', 0xaced0005757200135b4c6a6176612e6c616e672e537472696e673badd256e7e91d7b470200007870000000047400086f7074696f6e20317400086f7074696f6e20327400086f7074696f6e20337400086f7074696f6e2034, 'Example question mcq', 'MCQ'),
(153, 'option 1', 0xaced0005757200135b4c6a6176612e6c616e672e537472696e673badd256e7e91d7b470200007870000000047400086f7074696f6e20317400086f7074696f6e20327400086f7074696f6e20337400086f7074696f6e2034, 'Example question mcq', 'MCQ'),
(154, 'option 1', 0xaced0005757200135b4c6a6176612e6c616e672e537472696e673badd256e7e91d7b470200007870000000047400086f7074696f6e20317400086f7074696f6e20327400086f7074696f6e20337400086f7074696f6e2034, 'Example question mcq', 'MCQ'),
(156, 'option 1', 0xaced0005757200135b4c6a6176612e6c616e672e537472696e673badd256e7e91d7b470200007870000000047400086f7074696f6e20317400086f7074696f6e20327400086f7074696f6e20337400086f7074696f6e2034, 'Example question mcq', 'MCQ'),
(157, '1', NULL, 'Numeric example question', 'Numeric'),
(158, '1', NULL, 'Numeric example question', 'Numeric'),
(159, '1', NULL, 'Numeric example question', 'Numeric'),
(160, 'True', NULL, 'Example question true false type true', 'True/False'),
(161, 'True', NULL, 'Example question true false type true', 'True/False'),
(162, 'True', NULL, 'Example question true false type true', 'True/False'),
(163, 'True', NULL, 'Example question true false type true', 'True/False'),
(164, 'True', NULL, 'Example question true false type true', 'True/False'),
(165, 'True', NULL, 'Example question true false type true', 'True/False');

-- --------------------------------------------------------

--
-- Table structure for table `quiz`
--

CREATE TABLE `quiz` (
  `id` int(11) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `questionnumber` int(11) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `totalmarks` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `quiz`
--

INSERT INTO `quiz` (`id`, `description`, `questionnumber`, `title`, `totalmarks`) VALUES
(1, 'easy math quiz', 10, 'math quiz 1', 10),
(12, 'sample quiz 1', 10, 'hassan_instructor quiz 1', 10),
(23, 'my sample quiz 2', 10, 'hassan_instructor quiz 2', 10),
(34, 'my sample quiz 3', 10, 'hassan_instructor quiz 3', 100),
(45, 'my sample quiz 4', 10, 'hassan_instructor quiz 4', 150),
(56, 'my sample quiz 5', 10, 'hassan_instructor quiz 5', 10),
(67, 'sample quiz by hassan_instructor 6', 10, 'my sample quiz 6', 20),
(78, 'quiz 8 sample 7', 10, 'sample quiz 7', 5),
(89, 'my sample quiz 9', 10, 'sample quiz 9', 30),
(100, 'quiz 10 sample 9', 10, 'my quiz 9', 50),
(111, 'my quiz 11', 10, 'instructor quiz 11', 40),
(122, 'the quiz number 12', 10, 'quiz 12', 70),
(133, 'quiz number 13', 10, 'the quiz 13', 130),
(144, 'my quiz no 14', 10, 'quiz no 14', 140),
(155, 'the last quiz', 10, 'quiz number 15', 100);

-- --------------------------------------------------------

--
-- Table structure for table `quiz_question`
--

CREATE TABLE `quiz_question` (
  `Quiz_id` int(11) NOT NULL,
  `questions_id` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `quiz_question`
--

INSERT INTO `quiz_question` (`Quiz_id`, `questions_id`) VALUES
(1, 2),
(1, 3),
(1, 4),
(1, 5),
(1, 6),
(1, 7),
(1, 8),
(1, 9),
(1, 10),
(1, 11),
(12, 13),
(12, 14),
(12, 15),
(12, 16),
(12, 17),
(12, 18),
(12, 19),
(12, 20),
(12, 21),
(12, 22),
(23, 24),
(23, 25),
(23, 26),
(23, 27),
(23, 28),
(23, 29),
(23, 30),
(23, 31),
(23, 32),
(23, 33),
(34, 35),
(34, 36),
(34, 37),
(34, 38),
(34, 39),
(34, 40),
(34, 41),
(34, 42),
(34, 43),
(34, 44),
(45, 46),
(45, 47),
(45, 48),
(45, 49),
(45, 50),
(45, 51),
(45, 52),
(45, 53),
(45, 54),
(45, 55),
(56, 57),
(56, 58),
(56, 59),
(56, 60),
(56, 61),
(56, 62),
(56, 63),
(56, 64),
(56, 65),
(56, 66),
(67, 68),
(67, 69),
(67, 70),
(67, 71),
(67, 72),
(67, 73),
(67, 74),
(67, 75),
(67, 76),
(67, 77),
(78, 79),
(78, 80),
(78, 81),
(78, 82),
(78, 83),
(78, 84),
(78, 85),
(78, 86),
(78, 87),
(78, 88),
(89, 90),
(89, 91),
(89, 92),
(89, 93),
(89, 94),
(89, 95),
(89, 96),
(89, 97),
(89, 98),
(89, 99),
(100, 101),
(100, 102),
(100, 103),
(100, 104),
(100, 105),
(100, 106),
(100, 107),
(100, 108),
(100, 109),
(100, 110),
(111, 112),
(111, 113),
(111, 114),
(111, 115),
(111, 116),
(111, 117),
(111, 118),
(111, 119),
(111, 120),
(111, 121),
(122, 123),
(122, 124),
(122, 125),
(122, 126),
(122, 127),
(122, 128),
(122, 129),
(122, 130),
(122, 131),
(122, 132),
(133, 134),
(133, 135),
(133, 136),
(133, 137),
(133, 138),
(133, 139),
(133, 140),
(133, 141),
(133, 142),
(133, 143),
(144, 145),
(144, 146),
(144, 147),
(144, 148),
(144, 149),
(144, 150),
(144, 151),
(144, 152),
(144, 153),
(144, 154),
(155, 156),
(155, 157),
(155, 158),
(155, 159),
(155, 160),
(155, 161),
(155, 162),
(155, 163),
(155, 164),
(155, 165);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `userName` varchar(255) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL,
  `score` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`userName`, `password`, `role`, `score`) VALUES
('hassan_student', 'student', 'Student', 0),
('hassanr', '123', 'student', 0),
('hassan_instructor', 'instructor', 'Instructor', 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `hibernate_sequences`
--
ALTER TABLE `hibernate_sequences`
  ADD PRIMARY KEY (`sequence_name`);

--
-- Indexes for table `question`
--
ALTER TABLE `question`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `quiz`
--
ALTER TABLE `quiz`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `quiz_question`
--
ALTER TABLE `quiz_question`
  ADD UNIQUE KEY `UK_emaf1dh012y3vrjrl2nyxiphy` (`questions_id`),
  ADD KEY `FK4dv986ko4hgpfg43qahdmwtbk` (`Quiz_id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`userName`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
