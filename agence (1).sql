-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  jeu. 09 juil. 2020 à 02:14
-- Version du serveur :  10.4.10-MariaDB
-- Version de PHP :  7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `agence`
--

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

DROP TABLE IF EXISTS `client`;
CREATE TABLE IF NOT EXISTS `client` (
  `id_client` int(11) NOT NULL AUTO_INCREMENT,
  `nom_client` varchar(50) NOT NULL,
  `prenom_client` varchar(50) NOT NULL,
  `ville_client` varchar(50) NOT NULL,
  `adresse_client` varchar(50) NOT NULL,
  `email_client` varchar(50) NOT NULL,
  PRIMARY KEY (`id_client`)
) ENGINE=MyISAM AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `client`
--

INSERT INTO `client` (`id_client`, `nom_client`, `prenom_client`, `ville_client`, `adresse_client`, `email_client`) VALUES
(1, 'ulrich', 'lamago', 'nabeul', 'ibn roucd', 'gmail'),
(2, 'lamago', 'kamajong', 'sousse', 'ibnrouch', 'gmail'),
(3, 'ulrich', 'lamago', 'lamago', 'rouchd', ''),
(4, 'kamajong ', 'la legende', 'sfax', '2 rue ibn rochd', 'kamajonglegeneral@gmail.com'),
(9, 'def', 'dfdd', 'nabeul', 'bin rouchd', 'dsdg@yafhk.tn'),
(13, 'mmm', 'mmm', 'nabeul', 'mmm', 'mmm'),
(14, 'monpelier', 'monpelier', 'sousse', '8000,nabeul', 'uuuu@gmail.com'),
(10, 'kl', 'ùm', 'nabeul', 'ml', 'mù'),
(11, 'nabeul', 'nabeul', 'nabeul', 'nabeul', 'nabeul'),
(12, 'nn', 'nn', 'tunis', 'nn', 'nn'),
(15, 'jean', 'pierre', 'sousse', 'sousse', 'ekan');

-- --------------------------------------------------------

--
-- Structure de la table `colis`
--

DROP TABLE IF EXISTS `colis`;
CREATE TABLE IF NOT EXISTS `colis` (
  `id_colis` int(50) NOT NULL AUTO_INCREMENT,
  `nom_colis` varchar(50) NOT NULL,
  `nom_expediteur` varchar(50) NOT NULL,
  `id_expediteur` int(50) NOT NULL,
  `ville_expediteur` varchar(50) NOT NULL,
  `nom_destinataire` varchar(50) NOT NULL,
  `ville_destinataire` varchar(50) NOT NULL,
  `tel_destinataire` varchar(50) NOT NULL,
  `date_envoi` varchar(50) NOT NULL,
  `statut` varchar(50) NOT NULL,
  `quantité` int(50) NOT NULL,
  PRIMARY KEY (`id_colis`)
) ENGINE=MyISAM AUTO_INCREMENT=20 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `colis`
--

INSERT INTO `colis` (`id_colis`, `nom_colis`, `nom_expediteur`, `id_expediteur`, `ville_expediteur`, `nom_destinataire`, `ville_destinataire`, `tel_destinataire`, `date_envoi`, `statut`, `quantité`) VALUES
(1, 'coussin', 'ulrich', 5, 'nabeul', 'lamago', 'nabeul', '6115', '0000-00-00', 'planifier', 0),
(4, 'ulrich', 'ulrich', 15, 'ulrich', 'ulrich', 'nabeul', 'ulrich', 'ulrich', 'planifier', 15),
(6, 'ulrich', 'ulrich', 15, 'ulrich', 'ulrich', 'nabeul', 'ulrich', 'ulrich', 'planifier', 15),
(8, 'qsdl', 'kkkkk', 2, 'tunis', 'kkkk', 'nabeul', 'sqdlk', '07/06/20', 'planifier', 15),
(19, 'pan', 'kun', 2, 'tunis', 'kun', 'nabeul', '25757963', '08/07/20', 'planifier', 15),
(17, 'hjkbjk', 'hkjkl', 2, 'tunis', 'kjhgljk', 'nabeul', 'kiuhjk', '13/06/20', 'planifier', 15),
(14, 'lmoik', 'kmkm', 2, 'tunis', 'kmkm', 'nabeul', '6996862554', '08/06/20', 'planifier', 15);

-- --------------------------------------------------------

--
-- Structure de la table `connecter`
--

DROP TABLE IF EXISTS `connecter`;
CREATE TABLE IF NOT EXISTS `connecter` (
  `id_employer` int(11) NOT NULL AUTO_INCREMENT,
  `login` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  PRIMARY KEY (`login`),
  UNIQUE KEY `id_employer` (`id_employer`),
  KEY `id_employer_2` (`id_employer`)
) ENGINE=MyISAM AUTO_INCREMENT=21 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `connecter`
--

INSERT INTO `connecter` (`id_employer`, `login`, `password`) VALUES
(10, 'pan4', 'pan'),
(9, 'pan', 'pan'),
(8, 'ulrich', 'ulrich'),
(11, 'pan2', 'pan2'),
(13, 'pana', 'panb'),
(15, 'kamajong', 'kamajong'),
(17, 'pro', 'pro'),
(18, 'j', 'j');

-- --------------------------------------------------------

--
-- Structure de la table `employer`
--

DROP TABLE IF EXISTS `employer`;
CREATE TABLE IF NOT EXISTS `employer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(50) NOT NULL,
  `prenom` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `poste` varchar(50) NOT NULL,
  `salaire` int(11) NOT NULL,
  `date_embauche` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=22 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `employer`
--

INSERT INTO `employer` (`id`, `nom`, `prenom`, `email`, `poste`, `salaire`, `date_embauche`) VALUES
(16, 'pro', 'pro', '@gmail', 'comptable', 50, '08/07/20'),
(17, 'admin', 'admin', 'admin', 'administrateur', 20500, '25/10/2020'),
(13, 'ulrich', 'ulrich', 'ulrichkamajong@gmail.com', 'chauffeur', 500, '08/07/20'),
(14, 'kamajong', 'kamajong', 'ulrichkamajong@gmail.com', 'chauffeur', 540, '08/07/20');

-- --------------------------------------------------------

--
-- Structure de la table `tourner`
--

DROP TABLE IF EXISTS `tourner`;
CREATE TABLE IF NOT EXISTS `tourner` (
  `id_touner` int(11) DEFAULT NULL,
  `ville_tourner` varchar(50) NOT NULL,
  `id_chauffeur` int(11) NOT NULL,
  `nom_chauffeur` varchar(50) NOT NULL,
  `date` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `tourner`
--

INSERT INTO `tourner` (`id_touner`, `ville_tourner`, `id_chauffeur`, `nom_chauffeur`, `date`) VALUES
(NULL, 'nabeul', 2, 'lamago', '13/06/20'),
(NULL, 'nabeul', 4, 'k', '19/06/20'),
(NULL, 'nabeul', 11, 'ken', '08/07/20');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
