/* Création de la table emp */
CREATE TABLE EMP(
	EMPNO INT unsigned NOT NULL,
	ENAME VARCHAR(50)NOT NULL,
	JOB VARCHAR(50) NOT NULL,
	MGR INT UNSIGNED,
	HIREDATE DATE NOT NULL,
	SAL DECIMAL(8,2)  NOT NULL,
	COMM  DECIMAL(8,2),
	DEPTNO TINYINT NOT NULL,
	CONSTRAINT CLE_EMPNO PRIMARY KEY(EMPNO));

/* Remplissage de la table emp */
INSERT INTO EMP(EMPNO,ENAME,JOB,MGR,HIREDATE,SAL,COMM,DEPTNO)
VALUES
(7369,'SMITH','CLERK',7902,'1980-12-17',800,0,20),
(7499,'SMITH','SALESMAN',7698,'1981-02-20',1600,300,30),
(7521,'WARD','SALESMAN',7698,'1981-02-22',1250,500,30),
(7566,'JONES','MANAGER',7839,'1981-04-02',2975,null,20),
(7654,'MARTIN','SALESMAN',7698,'1981-09-28',1250,1400,30),
(7698,'BLAKE','MANAGER',7839,'1981-05-01',2850,null,30),
(7782,'CLARK','MANAGER',7839,'1981-07-09',2450,null,10),
(7788,'SCOTT','ANALYST',7566,'1982-12-09',3000,null,20),
(7839,'KING','PRESIDENT',null,'1981-11-17',5000,null, 10),
(7844,'TURNER','SALESMAN',7698,'1981-09-08',1500,0,30),
(7876,'ADAMS','CLERK',7788,'1983-01-12',1100,null,20),
(7900,'JAMES','CLERK',7698,'1981-12-03',950,null,30),
(7902,'FORD','ANALYST',7566,'1981-12-03',3000,null,20),
(7934,'MILLER','CLERK',7782,'1982-01-23',1300,null,10);

/* Création de la table departement */
CREATE TABLE DEPT(
	DEPTNO TINYINT NOT NULL,
	DNAME VARCHAR(50) NOT NULL,
	LOC VARCHAR(50) NOT NULL,
	CONSTRAINT CLE_DEPTNO PRIMARY KEY(DEPTNO));

/* Remplissage de la table département */
INSERT INTO DEPT(DEPTNO,DNAME,LOC)
VALUES
(10,'ACCOUNTING','NEWYORK'),
(20,'RESEARCH','DALLAS'),
(30,'SALES','CHICAGO'),
(40,'OPERATIONS','BOSTON');

/* Ajout Clé étrangère entre MGR de emp et EMPNO de emp */
ALTER TABLE emp ADD CONSTRAINT fk_mgr_empno FOREIGN KEY (MGR) REFERENCES emp (EMPNO);

/* AJout de clé étrangère DEPTNO dans emp correspondant au numéro d'employé de la table dept */
ALTER TABLE emp ADD CONSTRAINT fk_deptno_empno FOREIGN KEY (DEPTNO) REFERENCES dept(DEPTNO);

/* Mise à jour du nom à ALLEN pour son numéro d'employe */
UPDATE emp SET ENAME='ALLEN' WHERE EMPNO = 7499;

/* Première partie */

/* 1/Donner nom,job,numéro et salaire de tous les employés du département 10 */
SELECT ENAME,JOB,EMPNO,SAL
FROM emp
WHERE DEPTNO =10;

/* 2/Donner nom,job et salaire des employés de type manager dont le salaire est supérieur à 2800 */
SELECT ENAME,JOB,EMPNO,SAL
FROM emp
WHERE JOB='MANAGER' AND SAL>2800;

/* 3/Donner la liste des manager nappartenant pas au département 30 */
SELECT JOB,DEPTNO
FROM emp
WHERE DEPTNO !=30 AND job='MANAGER';

/* 4/Liste des employes de salaire compris entre 1200 et 1400 */
SELECT *
FROM emp
WHERE SAL BETWEEN 1200 AND 1400;

/* 5/Liste des emplyes des départements 10 et 30 classés dans l'ordre alphabetique */
SELECT *
FROM emp
WHERE DEPTNO IN(10,30)
ORDER BY ENAME;

/* 6/Liste des emplyes du département 30 classés dans lordre des salaires croissants */
SELECT *
FROM emp
WHERE DEPTNO =30
ORDER BY SAL;

/* 7/Liste de tous les employés classes par emploi et salaires décroissants */
SELECT *
FROM emp
ORDER BY JOB,SAL DESC;

/* 8/Liste des différents enmplois */
SELECT DISTINCT JOB
FROM emp
ORDER BY JOB;

/* 9/Donner le nom du département ou travaille ALLEN */
SELECT ENAME,DNAME
FROM dept
INNER JOIN emp ON DEPT.DEPTNO = EMP.DEPTNO
WHERE emp.ENAME = 'ALLEN';

/* 10/Liste des emplyes avec nom du département, nom, job, salaire classés par noms de départements et par salaire décroissants */
SELECT DNAME,ENAME,JOB,SAL
FROM emp,dept
ORDER BY DNAME,SAL DESC;

/* 11/Liste des employés vendeurs(SALESMAN) avec affichage de nom, salaire, commissions, salaire + commissions */
SELECT ENAME,SAL,COMM,SAL + COMM
FROM emp
WHERE JOB = 'SALESMAN';

/* 12/Liste des employés du département 20: nom, job, DATE dembauche sous forme VEN 28 FEV 1997 */
SELECT ENAME,JOB, DATE_FORMAT(HIREDATE,"%D %M %Y")
FROM emp
WHERE DEPTNO =20;

/* 13/Donner le salaire le plus élevé par département */
SELECT DEPTNO, MAX(SAL)
FROM emp
GROUP BY DEPTNO;

/* 14/Donner départemebt par département masse salariale, nombre demployés, salaire moyen par type d'emploi */
SELECT DEPTNO, SUM(SAL), COUNT(EMPNO), AVG(SAL)
FROM emp
GROUP BY DEPTNO;

/* 15/Même question mais 'on' se limite aux sous-ensembles d'au moins 2 employés */
SELECT DEPTNO, SUM(SAL), COUNT(EMPNO), AVG(SAL)
FROM emp
GROUP BY DEPTNO
HAVING COUNT(EMPNO) >2;

/* 16/Liste des employés(Nom,Département,Salaire) de même emploi que JONES */
SELECT ENAME,DNAME,SAL
FROM emp
INNER JOIN dept ON emp.deptno=dept.DEPTNO
WHERE emp.job =(
SELECT JOB
FROM emp
WHERE ENAME ='JONES' AND ename <>'jones';

/* 17/Liste des employés (nom,salaire) dont le salaire est supérieur à la moyenne globale des salaires */
SELECT ENAME,SAL
FROM emp
WHERE SAL > (
SELECT AVG(sal)
FROM emp);

/* 18/Création dune table PROJET avec comme colonnes numéro de projet (3 chiffres), nom de projet(5 caractères), budget. Entrez les valeurs suivantes: 
101, ALPHA, 96000
102, BETA,82000
103, GAMMA, 15000*/

CREATE TABLE projet (
	PROJNO INT unsigned NOT NULL,
	PROJNOM VARCHAR(5) NOT NULL,
	BUDG INT UNSIGNED NOT NULL);

INSERT INTO projet(PROJNO,PROJNOM,BUDG)
VALUES
(101,'ALPHA',96000),
(102,'BETA',82000),
(103,'GAMMA',15000);

/* 19/Ajouter l'attribut numéro de projet à la table EMP et affecter tous les vendeurs du département 30 au projet 101, et les autres au projet 102 */
UPDATE emp SET PROJNO = CASE WHEN JOB='SALESMAN' AND DEPTNO=30 THEN 101 ELSE 102 END;

/* Création d'une clé primaire dans la table projet*/
ALTER TABLE projet ADD CONSTRAINT pk_projet PRIMARY KEY CLUSTERED (projno);

/* Création du clé étrangère dans la table emp liée à la table projet */
ALTER TABLE emp ADD CONSTRAINT fk_emp_proj FOREIGN KEY (PROJNO) REFERENCES projet(PROJNO);

/* 20/Créer une vue comportant tous les emplyés avec nom,job,nom de département et nom de projet */
CREATE VIEW Vue_Synthèse1(NomSal,Emploi,Service,Proj) AS SELECT ENAME,JOB,DNAME,PROJNOM
FROM emp
INNER JOIN dept ON dept.DEPTNO = emp.DEPTNO
INNER JOIN projet ON emp.PROJNO = projet.PROJNO;

/* 21/A l'aide de la vue créée précédement, lister tous les employés avec nom, job, nom de département et nom de projet */
CREATE VIEW Vue_synthèse2(NomSal,Emploi,Service,Proj) AS SELECT ENAME,JOB,DNAME,PROJNOM
FROM emp
INNER JOIN dept ON dept.DEPTNO = emp.DEPTNO
INNER JOIN projet ON emp.PROJNO = projet.PROJNO

SELECT NomSal,Emploi,Service,Proj FROM Vue_Synthèse1
ORDER BY service,proj;
/* 22/Donner le nom du projet associé à chaque manager */
-- SELECT PROJNOM,JOB
-- FROM emp
-- INNER JOIN dept ON dept.DEPTNO = emp.DEPTNO
-- INNER JOIN projet ON emp.PROJNO =projet.PROJNO
-- WHERE job='MANAGER'
/* Mauvaise approche de la question */

SELECT ename, projnom FROM emp
INNER JOIN projet ON emp.projno = projet.projno 
WHERE empno IN 
(SELECT DISTINCT mgr FROM emp WHERE mgr IS NOT NULL);


/* Deuxième partie */

/* 1/Afficher la liste des managers des départements 20 et 30 */
SELECT ENAME,JOB,DEPTNO
FROM emp
WHERE deptno IN(20,30) AND job='MANAGER';

/* 2/Afficher la liste des employés qui ne sont pas manager et quiont été embauchés en 81 */
SELECT *
FROM emp
WHERE job <> 'MANAGER' AND DATE_FORMAT(hiredate,'%Y')= 1981;

/* 3/Afficher la liste des employés ayant une commission */
SELECT *
FROM emp
WHERE comm <> 0 AND comm IS NOT NULL;

/* 4/Afficher la liste des noms, numéros de département, jobs et date d'embauche triés par Numéro de Département et Job les derniers embauchés d'abord */
SELECT ENAME,DEPTNO,JOB,HIREDATE
FROM emp
ORDER BY HIREDATE DESC,DEPTNO;

/* 5/Afficher la liste des employés travaillant à DALLAS */
SELECT *
FROM emp
INNER JOIN dept ON dept.deptno = emp.deptno
WHERE LOC ='DALLAS';

/* 6/Afficher les noms et dates d'embauche des employés embauchés avant leur manager, avec le nom et date d'embauche du manager */
SELECT t1.EName, t1.hiredate AS 'Embauche employés', t1.DeptNo, t2.EName AS Manager, t2.hiredate AS 'Embauche manager'
FROM emp t1, emp t2
WHERE t1.hiredate < t2.HireDate AND t1.mgr = t2.empno;

/* 7/Lister les numéros des employés n'ayant pas de subordonné triés par manager */
SELECT ename,mgr
FROM emp
WHERE EMPNO NOT IN(
SELECT  distinct MGR FROM emp WHERE mgr IS NOT NULL) ORDER BY mgr;

/* 8/ Afficher les noms et dates d'embauche des employés embauchés avant BLAKE */
SELECT emp.ENAME,emp.HIREDATE
FROM emp
WHERE emp.hiredate <
(SELECT emp.hiredate FROM emp WHERE emp.ename = 'BLAKE');

/* 9/ Afficher les employés embauchés le même jour que ford */
SELECT * 
FROM emp
WHERE emp.ename != 'FORD' AND emp.hiredate  =
(SELECT emp.hiredate FROM emp WHERE emp.ename = 'FORD');

/* 10/ Lister les employés ayant le même manager que CLARK */
SELECT emp.*,(SELECT ename FROM emp WHERE emp.empno= (SELECT emp.MGR FROM emp WHERE emp.ename ='CLARK') ) AS 'nom du manager'
FROM emp
WHERE emp.ename != 'CLARK' AND emp.mgr =
(SELECT emp.MGR FROM emp WHERE emp.ename ='CLARK');

/* 11/ Lister les employés qyant le même job et même manager que turner */
SELECT *,(SELECT ename FROM emp WHErE emp.empno=(SELECT mgr FROM emp WHERE emp.ename ='TURNER')) AS 'NOm du manager'
FROM emp
WHERE emp.ENAME != 'TURNER' AND emp.job = 
(SELECT emp.JOB FROM emp WHERE emp.ename ='TURNER')
AND emp.mgr =
(SELECT emp.mgr FROM emp WHERE emp.ename ='TURNER');

/* 12/Lister les employés du département RESEARCH embauchés le même jour que quelqu'un du département SALES */
SELECT *
FROM emp
INNER JOIN dept ON dept.DEPTNO = emp.DEPTNO 
WHERE dept.DNAME ='RESEARCH' AND  emp.hiredate = ANY
(SELECT hiredate FROM emp
INNER JOIN dept ON dept.DEPTNO = emp.deptno
WHERE dept.dname = 'SALES');

/* 13/Lister le nom des employés et également le nom du jour de la semaine correspondant à leur date d'embauche */
SELECT ENAME, DAY(hiredate)
FROM emp;

/* 14/Donner, pour chaque emplyé, le nombre de mois qui s'est écoulé entre leur date d'embauche et la date actuelle.*/
SELECT ENAME AS nom_employe,TIMESTAMPDIFF(MONTH,HIREDATE,NOW()) AS 'Mois passés depuis embauche'
FROM emp;

/* 15/Afficher la liste des employés ayant un M et un A dans leur nom */
SELECT ENAME 
FROM emp
WHERE ENAME LIKE '%A%M%' OR ENAME LIKE '%M%A%';

/* 16/Afficher la liste des employés ayant deux 'A' dans leur nom */
SELECT ENAME 
FROM emp
WHERE ENAME LIKE '%A%A%';

/* 17/Afficher les employés embauchés avant tous les employés du département 10 */
SELECT ENAME
FROM emp
WHERE HIREDATE < ALL
(SELECT hiredate
FROM emp
WHERE deptno =10);

/* 18/Sélectionner le métier où le salaire moyen est le plus faible */
SELECT JOB,AVG(SAL) 
FROM emp
GROUP BY JOB
HAVING AVG(sal) <= ALL
(SELECT AVG(SAL) 
FROM emp
GROUP BY job );

/* 19/ Sélectionner le département ayant le plus d'employés */
SELECT COUNT(*),emp.deptno,DNAME
FROM emp
INNER JOIN dept ON emp.deptno = dept.deptno
GROUP BY DEPTNO
HAVING COUNT(*) >= ALL
(SELECT COUNT(*) 
FROM emp
GROUP BY deptno);

/* Mauvaise approche de la question */
SELECT DEPTNO
FROM emp
GROUP BY DEPTNO
ORDER BY COUNT(emp.EMPNO) DESC LIMIT 1;

/* Pour sortir le nom de département avec la mauvaise approche de la question*/
SELECT DNAME
FROM dept
INNER JOIN emp ON dept.DEPTNO = emp.DEPTNO
GROUP BY DNAME
ORDER BY COUNT(emp.EMPNO) DESC LIMIT 1;

/* 20/Donner la répartition en pourcentage du nombre d'employés par département selon le modèle ci-dessous */
SELECT DEPTNO AS 'Département',ROUND(COUNT(DEPTNO)/(SELECT COUNT(DEPTNO) FROM emp)*100,2) AS 'Répartition en %'
FROM emp
GROUP BY DEPTNO;