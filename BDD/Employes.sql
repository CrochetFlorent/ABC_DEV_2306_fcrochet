-- --------------------------------------------------------
-- Hôte:                         127.0.0.1
-- Version du serveur:           8.0.30 - MySQL Community Server - GPL
-- SE du serveur:                Win64
-- HeidiSQL Version:             12.1.0.6537
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

-- Listage des données de la table employes.dept : ~4 rows (environ)
INSERT INTO `dept` (`DEPTNO`, `DNAME`, `LOC`) VALUES
	(10, 'ACCOUNTING', 'NEWYORK'),
	(20, 'RESEARCH', 'DALLAS'),
	(30, 'SALES', 'CHICAGO'),
	(40, 'OPERATIONS', 'BOSTON');

-- Listage des données de la table employes.emp : ~14 rows (environ)
INSERT INTO `emp` (`EMPNO`, `ENAME`, `JOB`, `MGR`, `HIREDATE`, `SAL`, `COMM`, `DEPTNO`, `PROJNO`) VALUES
	(7369, 'SMITH', 'CLERK', 7902, '1980-12-17', 800.00, 0.00, 20, 102),
	(7499, 'ALLEN', 'SALESMAN', 7698, '1981-02-20', 1600.00, 300.00, 30, 101),
	(7521, 'WARD', 'SALESMAN', 7698, '1981-02-22', 1250.00, 500.00, 30, 101),
	(7566, 'JONES', 'MANAGER', 7839, '1981-04-02', 2975.00, NULL, 20, 102),
	(7654, 'MARTIN', 'SALESMAN', 7698, '1981-09-28', 1250.00, 1400.00, 30, 101),
	(7698, 'BLAKE', 'MANAGER', 7839, '1981-05-01', 2850.00, NULL, 30, 102),
	(7782, 'CLARK', 'MANAGER', 7839, '1981-07-09', 2450.00, NULL, 10, 102),
	(7788, 'SCOTT', 'ANALYST', 7566, '1982-12-09', 3000.00, NULL, 20, 102),
	(7839, 'KING', 'PRESIDENT', NULL, '1981-11-17', 5000.00, NULL, 10, 102),
	(7844, 'TURNER', 'SALESMAN', 7698, '1981-09-08', 1500.00, 0.00, 30, 101),
	(7876, 'ADAMS', 'CLERK', 7788, '1983-01-12', 1100.00, NULL, 20, 102),
	(7900, 'JAMES', 'CLERK', 7698, '1981-12-03', 950.00, NULL, 30, 102),
	(7902, 'FORD', 'ANALYST', 7566, '1981-12-03', 3000.00, NULL, 20, 102),
	(7934, 'MILLER', 'CLERK', 7782, '1982-01-23', 1300.00, NULL, 10, 102);

-- Listage des données de la table employes.projet : ~3 rows (environ)
INSERT INTO `projet` (`PROJNO`, `PROJNOM`, `BUDG`) VALUES
	(101, 'ALPHA', 96000),
	(102, 'BETA', 82000),
	(103, 'GAMMA', 15000);

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
