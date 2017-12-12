-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: 12 Des 2017 pada 15.28
-- Versi Server: 5.7.15-log
-- PHP Version: 5.6.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kuis1106`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `cv_1106`
--

CREATE TABLE `cv_1106` (
  `id` bigint(20) NOT NULL,
  `alamat` varchar(255) DEFAULT NULL,
  `nama` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `cv_1106`
--

INSERT INTO `cv_1106` (`id`, `alamat`, `nama`) VALUES
(1, 'Jalan Budiasri', 'Syarif hidayatullah'),
(2, 'Jalan Umbansari', 'Elok'),
(3, 'Fandy', 'jalan air hitam');

-- --------------------------------------------------------

--
-- Struktur dari tabel `nilai_1106`
--

CREATE TABLE `nilai_1106` (
  `id_nilai` bigint(20) NOT NULL,
  `nilai_praktikum` varchar(255) DEFAULT NULL,
  `nilai_teori` varchar(150) NOT NULL,
  `category_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `nilai_1106`
--

INSERT INTO `nilai_1106` (`id_nilai`, `nilai_praktikum`, `nilai_teori`, `category_id`) VALUES
(1, '89', '77', NULL),
(2, '92', '81', NULL),
(3, '75', '62', NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cv_1106`
--
ALTER TABLE `cv_1106`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_3vln3c559qk6uxn467v47fecn` (`nama`);

--
-- Indexes for table `nilai_1106`
--
ALTER TABLE `nilai_1106`
  ADD PRIMARY KEY (`id_nilai`),
  ADD KEY `FKprspmn5jiermtfe9b66clhxie` (`category_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cv_1106`
--
ALTER TABLE `cv_1106`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `nilai_1106`
--
ALTER TABLE `nilai_1106`
  MODIFY `id_nilai` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `nilai_1106`
--
ALTER TABLE `nilai_1106`
  ADD CONSTRAINT `FKprspmn5jiermtfe9b66clhxie` FOREIGN KEY (`category_id`) REFERENCES `cv_1106` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
