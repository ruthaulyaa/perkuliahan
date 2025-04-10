USE PresDB
GO
INSERT INTO STATE VALUES ('Massachusetts', NULL, 1776);
INSERT INTO STATE VALUES ('Pensylvania', NULL, 1776);
INSERT INTO STATE VALUES ('Virginia', NULL, 1776);
INSERT INTO STATE VALUES ('Connecticut', NULL, 1776);
INSERT INTO STATE VALUES ('South Carolina', NULL, 1776);
INSERT INTO STATE VALUES ('Maryland', NULL, 1776);
INSERT INTO STATE VALUES ('New Jersey', NULL, 1776);
INSERT INTO STATE VALUES ('Georgia', NULL, 1776);
INSERT INTO STATE VALUES ('New Hampshire', NULL, 1776);
INSERT INTO STATE VALUES ('Delaware', NULL, 1776);
INSERT INTO STATE VALUES ('New York', NULL, 1776);
INSERT INTO STATE VALUES ('North Carolina', NULL, 1776);
INSERT INTO STATE VALUES ('Rhode Island', NULL, 1776);
INSERT INTO STATE VALUES ('Vermont', 1, 1791);
INSERT INTO STATE VALUES ('Kentucky', 1, 1792);
INSERT INTO STATE VALUES ('Tennessee', 2, 1796);
INSERT INTO STATE VALUES ('Ohio', 4, 1803);
INSERT INTO STATE VALUES ('Louisianna', 6, 1812);
INSERT INTO STATE VALUES ('Indiana', 7, 1816);
INSERT INTO STATE VALUES ('Mississippi', 8, 1817);
INSERT INTO STATE VALUES ('Illinois', 8, 1818);
INSERT INTO STATE VALUES ('Alabama', 8, 1819);
INSERT INTO STATE VALUES ('Maine', 8, 1820);
INSERT INTO STATE VALUES ('Missouri', 9, 1821);
INSERT INTO STATE VALUES ('Arkansas', 12, 1836);
INSERT INTO STATE VALUES ('Michigan', 12, 1837);
INSERT INTO STATE VALUES ('Florida', 14, 1845);
INSERT INTO STATE VALUES ('Texas', 15, 1845);
INSERT INTO STATE VALUES ('Iowa', 15, 1846);
INSERT INTO STATE VALUES ('Wisconsin', 15, 1848);
INSERT INTO STATE VALUES ('California', 16, 1850);
INSERT INTO STATE VALUES ('Minnesota', 18, 1858);
INSERT INTO STATE VALUES ('Oregon', 18, 1859);
INSERT INTO STATE VALUES ('Kansas', 18, 1861);
INSERT INTO STATE VALUES ('West Virginia', 19, 1863);
INSERT INTO STATE VALUES ('Nevada', 19, 1864);
INSERT INTO STATE VALUES ('Nebraska', 20, 1867);
INSERT INTO STATE VALUES ('Colorado', 22, 1876);
INSERT INTO STATE VALUES ('North Dakota', 26, 1889);
INSERT INTO STATE VALUES ('South Dakota', 26, 1889);
INSERT INTO STATE VALUES ('Montana', 26, 1889);
INSERT INTO STATE VALUES ('Washington', 26, 1889);
INSERT INTO STATE VALUES ('Idaho', 26, 1890);
INSERT INTO STATE VALUES ('Wyoming', 26, 1890);
INSERT INTO STATE VALUES ('Utah', 27, 1896);
INSERT INTO STATE VALUES ('Oklahoma', 30, 1907);
INSERT INTO STATE VALUES ('New Mexico', 31, 1912);
INSERT INTO STATE VALUES ('Arizona', 31, 1912);
INSERT INTO STATE VALUES ('Alaska', 43, 1959);
INSERT INTO STATE VALUES ('Hawaii', 43, 1959);
GO
INSERT INTO PRESIDENT VALUES ('Washington G', 1732, 7, 67, 'Federalist', 'Virginia');
INSERT INTO PRESIDENT VALUES ('Adams J', 1735, 4, 90, 'Federalist', 'Massachusetts');
INSERT INTO PRESIDENT VALUES ('Jefferson T', 1743, 8, 83, 'Demo-Rep', 'Virginia');
INSERT INTO PRESIDENT VALUES ('Madison J', 1751, 8, 85, 'Demo-Rep', 'Virginia');
INSERT INTO PRESIDENT VALUES ('Monroe J', 1758, 8, 73, 'Demo-Rep', 'Virginia');
INSERT INTO PRESIDENT VALUES ('Adams J Q', 1767, 4, 80, 'Demo-Rep', 'Massachusetts');
INSERT INTO PRESIDENT VALUES ('Jackson A', 1767, 8, 78, 'Democratic', 'South Carolina');
INSERT INTO PRESIDENT VALUES ('Van Buren M', 1782, 4, 79, 'Democratic', 'New York');
INSERT INTO PRESIDENT VALUES ('Harrison W H', 1773, 0, 68, 'Whig', 'Virginia');
INSERT INTO PRESIDENT VALUES ('Tyler J', 1790, 3, 71, 'Whig', 'Virginia');
INSERT INTO PRESIDENT VALUES ('Polk J K', 1795, 4, 53, 'Democratic', 'North Carolina');
INSERT INTO PRESIDENT VALUES ('Taylor Z', 1784, 1, 65, 'Whig', 'Virginia');
INSERT INTO PRESIDENT VALUES ('Fillmore M', 1800, 2, 74, 'Whig', 'New York');
INSERT INTO PRESIDENT VALUES ('Pierce F', 1804, 4, 64, 'Democratic', 'New Hampshire');
INSERT INTO PRESIDENT VALUES ('Buchanan J', 1791, 4, 77, 'Democratic', 'Pensylvania');
INSERT INTO PRESIDENT VALUES ('Lincoln A', 1809, 4, 56, 'Republican', 'Kentucky');
INSERT INTO PRESIDENT VALUES ('Johnson A', 1808, 3, 66, 'Democratic', 'North Carolina');
INSERT INTO PRESIDENT VALUES ('Grant U S', 1822, 8, 63, 'Republican', 'Ohio');
INSERT INTO PRESIDENT VALUES ('Hayes R B', 1822, 4, 70, 'Republican', 'Ohio');
INSERT INTO PRESIDENT VALUES ('Garfield J A', 1831, 0, 49, 'Republican', 'Ohio');
INSERT INTO PRESIDENT VALUES ('Arthur C A', 1830, 3, 56, 'Republican', 'Vermont');
INSERT INTO PRESIDENT VALUES ('Cleveland G', 1837, 8, 71, 'Democratic', 'New Jersey');
INSERT INTO PRESIDENT VALUES ('Harrison B', 1833, 4, 67, 'Republican', 'Ohio');
INSERT INTO PRESIDENT VALUES ('McKinley W', 1843, 4, 58, 'Republican', 'Ohio');
INSERT INTO PRESIDENT VALUES ('Roosevelt T', 1858, 7, 60, 'Republican', 'New York');
INSERT INTO PRESIDENT VALUES ('Taft W H', 1857, 4, 72, 'Republican', 'Ohio');
INSERT INTO PRESIDENT VALUES ('Wilson W', 1856, 8, 67, 'Democratic', 'Virginia');
INSERT INTO PRESIDENT VALUES ('Harding W G', 1865, 2, 57, 'Republican', 'Ohio');
INSERT INTO PRESIDENT VALUES ('Coolidge C', 1872, 5, 60, 'Republican', 'Vermont');
INSERT INTO PRESIDENT VALUES ('Hoover H C', 1874, 4, 90, 'Republican', 'Iowa');
INSERT INTO PRESIDENT VALUES ('Roosevelt F D', 1882, 12, 63, 'Democratic', 'New York');
INSERT INTO PRESIDENT VALUES ('Truman H S', 1884, 7, 88, 'Democratic', 'Missouri');
INSERT INTO PRESIDENT VALUES ('Eisenhower D D', 1890, 8, 79, 'Republican', 'Texas');
INSERT INTO PRESIDENT VALUES ('Kennedy J F', 1917, 2, 46, 'Democratic', 'Massachusetts');
INSERT INTO PRESIDENT VALUES ('Johnson L B', 1908, 5, 65, 'Democratic', 'Texas');
INSERT INTO PRESIDENT VALUES ('Nixon R M', 1913, 5, NULL, 'Republican', 'California');
INSERT INTO PRESIDENT VALUES ('Ford G R', 1913, 2, NULL, 'Republican', 'Nebraska');
INSERT INTO PRESIDENT VALUES ('Carter J E', 1924, 4, NULL, 'Democratic', 'Georgia');
INSERT INTO PRESIDENT VALUES ('Reagan R', 1911, 3, NULL, 'Republican', 'Illinois');

GO
INSERT INTO PRES_MARRIAGE VALUES ('Washington G', 'Custis M D', 26, 27, 0, 1759);
INSERT INTO PRES_MARRIAGE VALUES ('Adams J', 'Smith A', 28, 19, 5, 1764);
INSERT INTO PRES_MARRIAGE VALUES ('Jefferson T', 'Skelton M W', 28, 23, 6, 1772);
INSERT INTO PRES_MARRIAGE VALUES ('Madison J', 'Todd D D P', 43, 26, 0, 1794);
INSERT INTO PRES_MARRIAGE VALUES ('Monroe J', 'Kortright E', 27, 17, 3, 1786);
INSERT INTO PRES_MARRIAGE VALUES ('Adams J Q', 'Johnson L C', 30, 22, 4, 1797);
INSERT INTO PRES_MARRIAGE VALUES ('Jackson A', 'Robards R D', 26, 26, 0, 1794);
INSERT INTO PRES_MARRIAGE VALUES ('Van Buren M', 'Hoes H', 24, 23, 4, 1807);
INSERT INTO PRES_MARRIAGE VALUES ('Harrison W H', 'Symmes A T', 22, 20, 10, 1795);
INSERT INTO PRES_MARRIAGE VALUES ('Tyler J', 'Christian L', 23, 22, 8, 1813);
INSERT INTO PRES_MARRIAGE VALUES ('Tyler J', 'Gardiner J', 54, 24, 7, 1844);
INSERT INTO PRES_MARRIAGE VALUES ('Polk J K', 'Childress S', 28, 20, 0, 1824);
INSERT INTO PRES_MARRIAGE VALUES ('Taylor Z', 'Smith M M', 25, 21, 6, 1810);
INSERT INTO PRES_MARRIAGE VALUES ('Fillmore M', 'Powers A', 26, 27, 2, 1826);
INSERT INTO PRES_MARRIAGE VALUES ('Fillmore M', 'McIntosh C C', 58, 44, 0, 1858);
INSERT INTO PRES_MARRIAGE VALUES ('Pierce F', 'Appleton J M', 29, 28, 3, 1834);
INSERT INTO PRES_MARRIAGE VALUES ('Lincoln A', 'Todd M', 33, 23, 4, 1842);
INSERT INTO PRES_MARRIAGE VALUES ('Johnson A', 'McCardle E', 18, 16, 5, 1827);
INSERT INTO PRES_MARRIAGE VALUES ('Grant U S', 'Dent J B', 26, 22, 4, 1848);
INSERT INTO PRES_MARRIAGE VALUES ('Hayes R B', 'Webb L W', 30, 21, 8, 1852);
INSERT INTO PRES_MARRIAGE VALUES ('Garfield J A', 'Rudolph L', 26, 26, 7, 1858);
INSERT INTO PRES_MARRIAGE VALUES ('Arthur C A', 'Herndon E L', 29, 22, 3, 1859);
INSERT INTO PRES_MARRIAGE VALUES ('Cleveland G', 'Folson F', 49, 21, 5, 1886);
INSERT INTO PRES_MARRIAGE VALUES ('Harrison B', 'Scott C L', 20, 21, 2, 1853);
INSERT INTO PRES_MARRIAGE VALUES ('Harrison B', 'Dimmick M S L', 62, 37, 1, 1896);
INSERT INTO PRES_MARRIAGE VALUES ('McKinley W', 'Saxton I', 27, 23, 2, 1871);
INSERT INTO PRES_MARRIAGE VALUES ('Roosevelt T', 'Lee A H', 22, 19, 1, 1880);
INSERT INTO PRES_MARRIAGE VALUES ('Roosevelt T', 'Carow E K', 28, 25, 5, 1886);
INSERT INTO PRES_MARRIAGE VALUES ('Taft W H', 'Herron H', 28, 25, 3, 1886);
INSERT INTO PRES_MARRIAGE VALUES ('Wilson W', 'Axson E L', 28, 25, 3, 1885);
INSERT INTO PRES_MARRIAGE VALUES ('Wilson W', 'Galt E B', 58, 43, 0, 1915);
INSERT INTO PRES_MARRIAGE VALUES ('Harding W G', 'De Wolfe F K', 25, 30, 0, 1891);
INSERT INTO PRES_MARRIAGE VALUES ('Coolidge C', 'Goodhue G A', 33, 26, 2, 1905);
INSERT INTO PRES_MARRIAGE VALUES ('Hoover H C', 'Henry L', 24, 23, 2, 1899);
INSERT INTO PRES_MARRIAGE VALUES ('Roosevelt F D', 'Roosevelt A E', 23, 20, 6, 1905);
INSERT INTO PRES_MARRIAGE VALUES ('Truman H S', ' Wallace E V', 35, 34, 1, 1919);
INSERT INTO PRES_MARRIAGE VALUES ('Eisenhower D D', 'Doud G', 25, 19, 2, 1916);
INSERT INTO PRES_MARRIAGE VALUES ('Kennedy J F', 'Bouvier J L', 36, 24, 3, 1953);
INSERT INTO PRES_MARRIAGE VALUES ('Johnson L B', 'Taylor C A', 26, 21, 2, 1934);
INSERT INTO PRES_MARRIAGE VALUES ('Nixon R M', 'Ryan T C', 27, 28, 2, 1940);
INSERT INTO PRES_MARRIAGE VALUES ('Ford G R', 'Warren E B', 35, 30, 4, 1948);
INSERT INTO PRES_MARRIAGE VALUES ('Carter J E', 'Smith R', 21, 18, 4, 1946);
INSERT INTO PRES_MARRIAGE VALUES ('Reagan R', 'Wyman J', 28, 25, 2, 1940);
INSERT INTO PRES_MARRIAGE VALUES ('Reagan R', 'Davis N', 41, 28, 2, 1952);

GO
INSERT INTO PRES_HOBBY VALUES ('Adams J Q', 'Billiards');
INSERT INTO PRES_HOBBY VALUES ('Adams J Q', 'Swimming');
INSERT INTO PRES_HOBBY VALUES ('Adams J Q', 'Walking');
INSERT INTO PRES_HOBBY VALUES ('Arthur C A', 'Fishing');
INSERT INTO PRES_HOBBY VALUES ('Cleveland G', 'Fishing');
INSERT INTO PRES_HOBBY VALUES ('Coolidge C', 'Fishing');
INSERT INTO PRES_HOBBY VALUES ('Coolidge C', 'Golf');
INSERT INTO PRES_HOBBY VALUES ('Coolidge C', 'Indian Clubs');
INSERT INTO PRES_HOBBY VALUES ('Coolidge C', 'Mechanical Horse');
INSERT INTO PRES_HOBBY VALUES ('Coolidge C', 'Pitching Hay');
INSERT INTO PRES_HOBBY VALUES ('Eisenhower D D', 'Bridge');
INSERT INTO PRES_HOBBY VALUES ('Eisenhower D D', 'Golf');
INSERT INTO PRES_HOBBY VALUES ('Eisenhower D D', 'Hunting');
INSERT INTO PRES_HOBBY VALUES ('Eisenhower D D', 'Painting ');
INSERT INTO PRES_HOBBY VALUES ('Eisenhower D D', 'Fishing');
INSERT INTO PRES_HOBBY VALUES ('Garfield J A', 'Billiards');
INSERT INTO PRES_HOBBY VALUES ('Harding W G', 'Golf');
INSERT INTO PRES_HOBBY VALUES ('Harding W G', 'Poker');
INSERT INTO PRES_HOBBY VALUES ('Harding W G', 'Riding');
INSERT INTO PRES_HOBBY VALUES ('Harrison B', 'Hunting');
INSERT INTO PRES_HOBBY VALUES ('Hayes R B', 'Croquet');
INSERT INTO PRES_HOBBY VALUES ('Hayes R B', 'Driving');
INSERT INTO PRES_HOBBY VALUES ('Hayes R B', 'Shooting');
INSERT INTO PRES_HOBBY VALUES ('Hoover H C', 'Fishing');
INSERT INTO PRES_HOBBY VALUES ('Hoover H C', 'Medicine Ball');
INSERT INTO PRES_HOBBY VALUES ('Jackson A', 'Riding');
INSERT INTO PRES_HOBBY VALUES ('Jefferson T', 'Fishing');
INSERT INTO PRES_HOBBY VALUES ('Jefferson T', 'Riding');
INSERT INTO PRES_HOBBY VALUES ('Johnson L B', 'Riding');
INSERT INTO PRES_HOBBY VALUES ('Kennedy J F', 'Sailing');
INSERT INTO PRES_HOBBY VALUES ('Kennedy J F', 'Swimming');
INSERT INTO PRES_HOBBY VALUES ('Kennedy J F', 'Touch Football');
INSERT INTO PRES_HOBBY VALUES ('Lincoln A', 'Walking');
INSERT INTO PRES_HOBBY VALUES ('McKinley W', 'Riding');
INSERT INTO PRES_HOBBY VALUES ('McKinley W', 'Swimming');
INSERT INTO PRES_HOBBY VALUES ('McKinley W', 'Walking');
INSERT INTO PRES_HOBBY VALUES ('Nixon R M', 'Golf');
INSERT INTO PRES_HOBBY VALUES ('Roosevelt F D', 'Fishing');
INSERT INTO PRES_HOBBY VALUES ('Roosevelt F D', 'Sailing');
INSERT INTO PRES_HOBBY VALUES ('Roosevelt F D', 'Swimming');
INSERT INTO PRES_HOBBY VALUES ('Roosevelt T', 'Boxing');
INSERT INTO PRES_HOBBY VALUES ('Roosevelt T', 'Hunting');
INSERT INTO PRES_HOBBY VALUES ('Roosevelt T', 'Jujitsu');
INSERT INTO PRES_HOBBY VALUES ('Roosevelt T', 'Riding');
INSERT INTO PRES_HOBBY VALUES ('Roosevelt T', 'Shooting');
INSERT INTO PRES_HOBBY VALUES ('Roosevelt T', 'Tennis');
INSERT INTO PRES_HOBBY VALUES ('Roosevelt T', 'Wrestling');
INSERT INTO PRES_HOBBY VALUES ('Taft W H', 'Golf');
INSERT INTO PRES_HOBBY VALUES ('Taft W H', 'Riding');
INSERT INTO PRES_HOBBY VALUES ('Taylor Z', 'Riding');
INSERT INTO PRES_HOBBY VALUES ('Truman H S', 'Fishing');
INSERT INTO PRES_HOBBY VALUES ('Truman H S', 'Poker');
INSERT INTO PRES_HOBBY VALUES ('Truman H S', 'Walking');
INSERT INTO PRES_HOBBY VALUES ('Van Buren M', 'Riding');
INSERT INTO PRES_HOBBY VALUES ('Washington G', 'Fishing');
INSERT INTO PRES_HOBBY VALUES ('Washington G', 'Riding');
INSERT INTO PRES_HOBBY VALUES ('Wilson W', 'Golf');
INSERT INTO PRES_HOBBY VALUES ('Wilson W', 'Riding');
INSERT INTO PRES_HOBBY VALUES ('Wilson W', 'Walking');

GO
INSERT INTO ADMINISTRATION VALUES (1, 'Washington G', 1789);
INSERT INTO ADMINISTRATION VALUES (2, 'Washington G', 1793);
INSERT INTO ADMINISTRATION VALUES (3, 'Adams J', 1797);
INSERT INTO ADMINISTRATION VALUES (4, 'Jefferson T', 1801);
INSERT INTO ADMINISTRATION VALUES (5, 'Jefferson T', 1805);
INSERT INTO ADMINISTRATION VALUES (6, 'Madison J', 1809);
INSERT INTO ADMINISTRATION VALUES (7, 'Madison J', 1813);
INSERT INTO ADMINISTRATION VALUES (8, 'Monroe J', 1817);
INSERT INTO ADMINISTRATION VALUES (9, 'Monroe J', 1821);
INSERT INTO ADMINISTRATION VALUES (10, 'Adams J Q', 1825);
INSERT INTO ADMINISTRATION VALUES (11, 'Jackson A', 1829);
INSERT INTO ADMINISTRATION VALUES (12, 'Jackson A', 1833);
INSERT INTO ADMINISTRATION VALUES (13, 'Van Buren M', 1837);
INSERT INTO ADMINISTRATION VALUES (14, 'Harrison W H', 1841);
INSERT INTO ADMINISTRATION VALUES (14, 'Tyler J', 1841);
INSERT INTO ADMINISTRATION VALUES (15, 'Polk J K', 1845);
INSERT INTO ADMINISTRATION VALUES (16, 'Taylor Z', 1849);
INSERT INTO ADMINISTRATION VALUES (16, 'Fillmore M', 1850);
INSERT INTO ADMINISTRATION VALUES (17, 'Pierce F', 1853);
INSERT INTO ADMINISTRATION VALUES (18, 'Buchanan J', 1857);
INSERT INTO ADMINISTRATION VALUES (19, 'Lincoln A', 1861);
INSERT INTO ADMINISTRATION VALUES (20, 'Lincoln A', 1865);
INSERT INTO ADMINISTRATION VALUES (20, 'Johnson A', 1865);
INSERT INTO ADMINISTRATION VALUES (21, 'Grant U S', 1869);
INSERT INTO ADMINISTRATION VALUES (22, 'Grant U S', 1873);
INSERT INTO ADMINISTRATION VALUES (23, 'Hayes R B', 1877);
INSERT INTO ADMINISTRATION VALUES (24, 'Garfield J A', 1881);
INSERT INTO ADMINISTRATION VALUES (24, 'Arthur C A', 1881);
INSERT INTO ADMINISTRATION VALUES (25, 'Cleveland G', 1885);
INSERT INTO ADMINISTRATION VALUES (26, 'Harrison B', 1889);
INSERT INTO ADMINISTRATION VALUES (27, 'Cleveland G', 1893);
INSERT INTO ADMINISTRATION VALUES (28, 'McKinley W', 1897);
INSERT INTO ADMINISTRATION VALUES (29, 'McKinley W', 1901);
INSERT INTO ADMINISTRATION VALUES (29, 'Roosevelt T', 1901);
INSERT INTO ADMINISTRATION VALUES (30, 'Roosevelt T', 1905);
INSERT INTO ADMINISTRATION VALUES (31, 'Taft W H', 1909);
INSERT INTO ADMINISTRATION VALUES (32, 'Wilson W', 1913);
INSERT INTO ADMINISTRATION VALUES (33, 'Wilson W', 1917);
INSERT INTO ADMINISTRATION VALUES (34, 'Harding W G', 1921);
INSERT INTO ADMINISTRATION VALUES (34, 'Coolidge C', 1923);
INSERT INTO ADMINISTRATION VALUES (35, 'Coolidge C', 1925);
INSERT INTO ADMINISTRATION VALUES (36, 'Hoover H C', 1929);
INSERT INTO ADMINISTRATION VALUES (37, 'Roosevelt F D', 1933);
INSERT INTO ADMINISTRATION VALUES (38, 'Roosevelt F D', 1937);
INSERT INTO ADMINISTRATION VALUES (39, 'Roosevelt F D', 1941);
INSERT INTO ADMINISTRATION VALUES (40, 'Roosevelt F D', 1945);
INSERT INTO ADMINISTRATION VALUES (40, 'Truman H S', 1945);
INSERT INTO ADMINISTRATION VALUES (41, 'Truman H S', 1949);
INSERT INTO ADMINISTRATION VALUES (42, 'Eisenhower D D', 1953);
INSERT INTO ADMINISTRATION VALUES (43, 'Eisenhower D D', 1957);
INSERT INTO ADMINISTRATION VALUES (44, 'Kennedy J F', 1961);
INSERT INTO ADMINISTRATION VALUES (44, 'Johnson L B', 1963);
INSERT INTO ADMINISTRATION VALUES (45, 'Johnson L B', 1965);
INSERT INTO ADMINISTRATION VALUES (46, 'Nixon R M', 1969);
INSERT INTO ADMINISTRATION VALUES (47, 'Nixon R M', 1973);
INSERT INTO ADMINISTRATION VALUES (47, 'Ford G R', 1974);
INSERT INTO ADMINISTRATION VALUES (48, 'Carter J E', 1977);
INSERT INTO ADMINISTRATION VALUES (49, 'Reagan R', 1981);

GO
INSERT INTO ADMIN_PR_VP VALUES (1, 'Washington G', 'Adams J');
INSERT INTO ADMIN_PR_VP VALUES (2, 'Washington G', 'Adams J');
INSERT INTO ADMIN_PR_VP VALUES (3, 'Adams J', 'Jefferson T');
INSERT INTO ADMIN_PR_VP VALUES (4, 'Jefferson T', 'Burr A');
INSERT INTO ADMIN_PR_VP VALUES (5, 'Jefferson T', 'Clinton G');
INSERT INTO ADMIN_PR_VP VALUES (6, 'Madison J', 'Clinton G');
INSERT INTO ADMIN_PR_VP VALUES (7, 'Madison J', 'Gerry E');
INSERT INTO ADMIN_PR_VP VALUES (8, 'Monroe J', 'Tompkins D');
INSERT INTO ADMIN_PR_VP VALUES (9, 'Monroe J', 'Tompkins D');
INSERT INTO ADMIN_PR_VP VALUES (10, 'Adams J Q', 'Calhoun J');
INSERT INTO ADMIN_PR_VP VALUES (11, 'Jackson A', 'Calhoun J');
INSERT INTO ADMIN_PR_VP VALUES (12, 'Jackson A', 'Van Buren M');
INSERT INTO ADMIN_PR_VP VALUES (13, 'Van Buren M', 'Johnson R M');
INSERT INTO ADMIN_PR_VP VALUES (14, 'Harrison W H', 'Tyler J');
INSERT INTO ADMIN_PR_VP VALUES (15, 'Polk J K', 'Dallas G M');
INSERT INTO ADMIN_PR_VP VALUES (16, 'Taylor Z', 'Fillmore M');
INSERT INTO ADMIN_PR_VP VALUES (17, 'Pierce F', 'De Vane King W R');
INSERT INTO ADMIN_PR_VP VALUES (18, 'Buchanan J', 'Breckinridge J C');
INSERT INTO ADMIN_PR_VP VALUES (19, 'Lincoln A', 'Hamlin H');
INSERT INTO ADMIN_PR_VP VALUES (20, 'Lincoln A', 'Johnson A');
INSERT INTO ADMIN_PR_VP VALUES (21, 'Grant U S', 'Colfax S');
INSERT INTO ADMIN_PR_VP VALUES (22, 'Grant U S', 'Wilson H');
INSERT INTO ADMIN_PR_VP VALUES (23, 'Hayes R B', 'Wheeler W');
INSERT INTO ADMIN_PR_VP VALUES (24, 'Garfield J A', 'Arthur C A');
INSERT INTO ADMIN_PR_VP VALUES (25, 'Cleveland G', 'Hendricks T A');
INSERT INTO ADMIN_PR_VP VALUES (26, 'Harrison B', 'Morton L P');
INSERT INTO ADMIN_PR_VP VALUES (27, 'Cleveland G', 'Stevenson A E');
INSERT INTO ADMIN_PR_VP VALUES (28, 'McKinley W', 'Hobart G A');
INSERT INTO ADMIN_PR_VP VALUES (29, 'McKinley W', 'Roosevelt T');
INSERT INTO ADMIN_PR_VP VALUES (30, 'Roosevelt T', 'Fairbanks C W');
INSERT INTO ADMIN_PR_VP VALUES (31, 'Taft W H', 'Sherman J S');
INSERT INTO ADMIN_PR_VP VALUES (32, 'Wilson W', 'Marshall T R');
INSERT INTO ADMIN_PR_VP VALUES (33, 'Wilson W', 'Marshall T R');
INSERT INTO ADMIN_PR_VP VALUES (34, 'Harding W G', 'Coolidge C');
INSERT INTO ADMIN_PR_VP VALUES (35, 'Coolidge C', 'Dawes C G');
INSERT INTO ADMIN_PR_VP VALUES (36, 'Hoover H C', 'Curtis C');
INSERT INTO ADMIN_PR_VP VALUES (37, 'Roosevelt F D', 'Garner J N');
INSERT INTO ADMIN_PR_VP VALUES (38, 'Roosevelt F D', 'Garner J N');
INSERT INTO ADMIN_PR_VP VALUES (39, 'Roosevelt F D', 'Wallace H A');
INSERT INTO ADMIN_PR_VP VALUES (40, 'Roosevelt F D', 'Truman H S');
INSERT INTO ADMIN_PR_VP VALUES (41, 'Truman H S', 'Barkley A W');
INSERT INTO ADMIN_PR_VP VALUES (42, 'Eisenhower D D', 'Nixon R M');
INSERT INTO ADMIN_PR_VP VALUES (43, 'Eisenhower D D', 'Nixon R M');
INSERT INTO ADMIN_PR_VP VALUES (44, 'Kennedy J F', 'Johnson L B');
INSERT INTO ADMIN_PR_VP VALUES (45, 'Johnson L B', 'Humphrey H H');
INSERT INTO ADMIN_PR_VP VALUES (46, 'Nixon R M', 'Agnew S T');
INSERT INTO ADMIN_PR_VP VALUES (47, 'Nixon R M', 'Agnew S T');
INSERT INTO ADMIN_PR_VP VALUES (47, 'Nixon R M', 'Ford G R');
INSERT INTO ADMIN_PR_VP VALUES (47, 'Ford G R', 'Rockefeller N A');
INSERT INTO ADMIN_PR_VP VALUES (48, 'Carter J E', 'Mondale W F');
INSERT INTO ADMIN_PR_VP VALUES (49, 'Reagan R', 'Bush G');

GO
INSERT INTO ELECTION VALUES (1789, 'Washington G', 69, 'W');
INSERT INTO ELECTION VALUES (1789, 'Adams J', 34, 'L');
INSERT INTO ELECTION VALUES (1789, 'Jay J', 9, 'L');
INSERT INTO ELECTION VALUES (1789, 'Harrison R H', 6, 'L');
INSERT INTO ELECTION VALUES (1789, 'Rutledge J', 6, 'L');
INSERT INTO ELECTION VALUES (1789, 'Hancock J', 4, 'L');
INSERT INTO ELECTION VALUES (1789, 'Clinton G', 3, 'L');
INSERT INTO ELECTION VALUES (1789, 'Huntington S', 2, 'L');
INSERT INTO ELECTION VALUES (1789, 'Milton J', 2, 'L');
INSERT INTO ELECTION VALUES (1789, 'Armstrong J', 1, 'L');
INSERT INTO ELECTION VALUES (1789, 'Lincoln B', 1, 'L');
INSERT INTO ELECTION VALUES (1789, 'Telfair E', 1, 'L');
INSERT INTO ELECTION VALUES (1792, 'Washington G', 132, 'W');
INSERT INTO ELECTION VALUES (1792, 'Adams J', 77, 'L');
INSERT INTO ELECTION VALUES (1792, 'Clinton G', 50, 'L');
INSERT INTO ELECTION VALUES (1792, 'Jefferson T', 4, 'L');
INSERT INTO ELECTION VALUES (1792, 'Burr A', 1, 'L');
INSERT INTO ELECTION VALUES (1796, 'Adams J', 71, 'W');
INSERT INTO ELECTION VALUES (1796, 'Jefferson T', 68, 'L');
INSERT INTO ELECTION VALUES (1796, 'Pinckney T', 59, 'L');
INSERT INTO ELECTION VALUES (1796, 'Burr A', 30, 'L');
INSERT INTO ELECTION VALUES (1796, 'Adams S', 15, 'L');
INSERT INTO ELECTION VALUES (1796, 'Ellsworth O', 11, 'L');
INSERT INTO ELECTION VALUES (1796, 'Clinton G', 7, 'L');
INSERT INTO ELECTION VALUES (1796, 'Jay J', 5, 'L');
INSERT INTO ELECTION VALUES (1796, 'Iredell J', 3, 'L');
INSERT INTO ELECTION VALUES (1796, 'Henry J', 2, 'L');
INSERT INTO ELECTION VALUES (1796, 'Johnson S', 2, 'L');
INSERT INTO ELECTION VALUES (1796, 'Washington G', 2, 'L');
INSERT INTO ELECTION VALUES (1796, 'Pinckney C C', 1, 'L');
INSERT INTO ELECTION VALUES (1800, 'Jefferson T', 73, 'W');
INSERT INTO ELECTION VALUES (1800, 'Burr A', 73, 'L');
INSERT INTO ELECTION VALUES (1800, 'Adams J', 65, 'L');
INSERT INTO ELECTION VALUES (1800, 'Pinckney C C', 64, 'L');
INSERT INTO ELECTION VALUES (1800, 'Jay J', 1, 'L');
INSERT INTO ELECTION VALUES (1804, 'Jefferson T', 162, 'W');
INSERT INTO ELECTION VALUES (1804, 'Pinckney C C', 14, 'L');
INSERT INTO ELECTION VALUES (1808, 'Madison J', 122, 'W');
INSERT INTO ELECTION VALUES (1808, 'Pinckney C C', 47, 'L');
INSERT INTO ELECTION VALUES (1808, 'Clinton G', 6, 'L');
INSERT INTO ELECTION VALUES (1812, 'Madison J', 128, 'W');
INSERT INTO ELECTION VALUES (1812, 'Clinton G', 89, 'L');
INSERT INTO ELECTION VALUES (1816, 'Monroe J', 183, 'W');
INSERT INTO ELECTION VALUES (1816, 'King R', 34, 'L');
INSERT INTO ELECTION VALUES (1820, 'Monroe J', 231, 'W');
INSERT INTO ELECTION VALUES (1820, 'Adams J Q', 1, 'L');
INSERT INTO ELECTION VALUES (1824, 'Adams J Q', 84, 'W');
INSERT INTO ELECTION VALUES (1824, 'Jackson A', 99, 'L');
INSERT INTO ELECTION VALUES (1824, 'Crawford W H', 41, 'L');
INSERT INTO ELECTION VALUES (1824, 'Clay H', 37, 'L');
INSERT INTO ELECTION VALUES (1828, 'Jackson A', 178, 'W');
INSERT INTO ELECTION VALUES (1828, 'Adams J', 83, 'L');
INSERT INTO ELECTION VALUES (1832, 'Jackson A', 219, 'W');
INSERT INTO ELECTION VALUES (1832, 'Clay H', 49, 'L');
INSERT INTO ELECTION VALUES (1832, 'Floyd J', 11, 'L');
INSERT INTO ELECTION VALUES (1832, 'Wirt W', 7, 'L');
INSERT INTO ELECTION VALUES (1836, 'Van Buren M', 170, 'W');
INSERT INTO ELECTION VALUES (1836, 'Harrison W H', 73, 'L');
INSERT INTO ELECTION VALUES (1836, 'White H L', 26, 'L');
INSERT INTO ELECTION VALUES (1836, 'Webster D', 14, 'L');
INSERT INTO ELECTION VALUES (1836, 'Mangum W P', 11, 'L');
INSERT INTO ELECTION VALUES (1840, 'Harrison W H', 234, 'W');
INSERT INTO ELECTION VALUES (1840, 'Van Buren M', 60, 'L');
INSERT INTO ELECTION VALUES (1844, 'Polk J K', 170, 'W');
INSERT INTO ELECTION VALUES (1844, 'Clay H', 105, 'L');
INSERT INTO ELECTION VALUES (1848, 'Taylor Z', 163, 'W');
INSERT INTO ELECTION VALUES (1848, 'Cass L', 127, 'L');
INSERT INTO ELECTION VALUES (1852, 'Pierce F', 254, 'W');
INSERT INTO ELECTION VALUES (1852, 'Scott, W', 42, 'L');
INSERT INTO ELECTION VALUES (1856, 'Buchanan J', 174, 'W');
INSERT INTO ELECTION VALUES (1856, 'Fremont J C', 114, 'L');
INSERT INTO ELECTION VALUES (1856, 'Fillmore M', 8, 'L');
INSERT INTO ELECTION VALUES (1860, 'Lincoln A', 180, 'W');
INSERT INTO ELECTION VALUES (1860, 'Breckinridge J', 72, 'L');
INSERT INTO ELECTION VALUES (1860, 'Bell J', 39, 'L');
INSERT INTO ELECTION VALUES (1860, 'Douglas S', 12, 'L');
INSERT INTO ELECTION VALUES (1864, 'Lincoln A', 212, 'W');
INSERT INTO ELECTION VALUES (1864, 'McClellan G B', 21, 'L');
INSERT INTO ELECTION VALUES (1868, 'Grant U S', 214, 'W');
INSERT INTO ELECTION VALUES (1868, 'Seymour H', 80, 'L');
INSERT INTO ELECTION VALUES (1872, 'Grant U S', 286, 'W');
INSERT INTO ELECTION VALUES (1872, 'Hendricks T A', 42, 'L');
INSERT INTO ELECTION VALUES (1872, 'Brown B G', 18, 'L');
INSERT INTO ELECTION VALUES (1872, 'Jenkins C J', 2, 'L');
INSERT INTO ELECTION VALUES (1872, 'Davis D', 1, 'L');
INSERT INTO ELECTION VALUES (1876, 'Hayes R B', 185, 'W');
INSERT INTO ELECTION VALUES (1876, 'Tilden S J', 184, 'L');
INSERT INTO ELECTION VALUES (1880, 'Garfield J A', 214, 'W');
INSERT INTO ELECTION VALUES (1880, 'Hancock W S', 155, 'L');
INSERT INTO ELECTION VALUES (1884, 'Cleveland G', 219, 'W');
INSERT INTO ELECTION VALUES (1884, 'Blaine J G', 182, 'L');
INSERT INTO ELECTION VALUES (1888, 'Harrison B', 233, 'W');
INSERT INTO ELECTION VALUES (1888, 'Cleveland G', 168, 'L');
INSERT INTO ELECTION VALUES (1892, 'Cleveland G', 277, 'W');
INSERT INTO ELECTION VALUES (1892, 'Harrison B', 145, 'L');
INSERT INTO ELECTION VALUES (1892, 'Weaver J B', 22, 'L');
INSERT INTO ELECTION VALUES (1896, 'McKinley W', 271, 'W');
INSERT INTO ELECTION VALUES (1896, 'Bryan W J', 176, 'L');
INSERT INTO ELECTION VALUES (1900, 'McKinley W', 292, 'W');
INSERT INTO ELECTION VALUES (1900, 'Bryan W J', 155, 'L');
INSERT INTO ELECTION VALUES (1904, 'Roosevelt T', 336, 'W');
INSERT INTO ELECTION VALUES (1904, 'Parker A B', 140, 'L');
INSERT INTO ELECTION VALUES (1908, 'Taft W H', 321, 'W');
INSERT INTO ELECTION VALUES (1908, 'Bryan W J', 162, 'L');
INSERT INTO ELECTION VALUES (1912, 'Wilson W', 435, 'W');
INSERT INTO ELECTION VALUES (1912, 'Roosevelt T', 88, 'L');
INSERT INTO ELECTION VALUES (1912, 'Taft W H', 8, 'L');
INSERT INTO ELECTION VALUES (1916, 'Wilson W', 277, 'W');
INSERT INTO ELECTION VALUES (1916, 'Hughes C E', 254, 'L');
INSERT INTO ELECTION VALUES (1920, 'Harding W G', 404, 'W');
INSERT INTO ELECTION VALUES (1920, 'Cox W W', 127, 'L');
INSERT INTO ELECTION VALUES (1924, 'Coolidge C', 382, 'W');
INSERT INTO ELECTION VALUES (1924, 'Davis J W', 136, 'L');
INSERT INTO ELECTION VALUES (1924, 'La Follette R M', 13, 'L');
INSERT INTO ELECTION VALUES (1928, 'Hoover H C', 444, 'W');
INSERT INTO ELECTION VALUES (1928, 'Smith A E', 87, 'L');
INSERT INTO ELECTION VALUES (1932, 'Roosevelt F D', 472, 'W');
INSERT INTO ELECTION VALUES (1932, 'Hoover H C', 59, 'L');
INSERT INTO ELECTION VALUES (1936, 'Roosevelt F D', 523, 'W');
INSERT INTO ELECTION VALUES (1936, 'Landon A M', 8, 'L');
INSERT INTO ELECTION VALUES (1940, 'Roosevelt F D', 449, 'W');
INSERT INTO ELECTION VALUES (1940, 'Wilkie W L', 82, 'L');
INSERT INTO ELECTION VALUES (1944, 'Roosevelt F D', 432, 'W');
INSERT INTO ELECTION VALUES (1944, 'Dewey T E', 99, 'L');
INSERT INTO ELECTION VALUES (1948, 'Truman H S', 303, 'W');
INSERT INTO ELECTION VALUES (1948, 'Dewey T E', 189, 'L');
INSERT INTO ELECTION VALUES (1948, 'Thurmond J S', 39, 'L');
INSERT INTO ELECTION VALUES (1952, 'Eisenhower D D', 442, 'W');
INSERT INTO ELECTION VALUES (1952, 'Stevenson A', 89, 'L');
INSERT INTO ELECTION VALUES (1956, 'Eisenhower D D', 457, 'W');
INSERT INTO ELECTION VALUES (1956, 'Stevenson A', 73, 'L');
INSERT INTO ELECTION VALUES (1956, 'Jones W B', 1, 'L');
INSERT INTO ELECTION VALUES (1960, 'Kennedy J F', 303, 'W');
INSERT INTO ELECTION VALUES (1960, 'Nixon R M', 219, 'L');
INSERT INTO ELECTION VALUES (1960, 'Byrd', 15, 'L');
INSERT INTO ELECTION VALUES (1964, 'Johnson L B', 486, 'W');
INSERT INTO ELECTION VALUES (1964, 'Goldwater B', 52, 'L');
INSERT INTO ELECTION VALUES (1968, 'Nixon R M', 301, 'W');
INSERT INTO ELECTION VALUES (1968, 'Humphrey H H', 191, 'L');
INSERT INTO ELECTION VALUES (1968, 'Wallace G C', 46, 'L');
INSERT INTO ELECTION VALUES (1972, 'Nixon R M', 520, 'W');
INSERT INTO ELECTION VALUES (1972, 'McGovern G S', 17, 'L');
INSERT INTO ELECTION VALUES (1972, 'Hospers J', 1, 'L');
INSERT INTO ELECTION VALUES (1976, 'Carter J E', 297, 'W');
INSERT INTO ELECTION VALUES (1976, 'Ford G R', 240, 'L');
INSERT INTO ELECTION VALUES (1980, 'Reagan R', 489, 'W');
INSERT INTO ELECTION VALUES (1980, 'Carter J', 49, 'L');
GO --1
SELECT DISTINCT(PARTY)
FROM PRESIDENT
GO --2
SELECT PARTY, COUNT(PARTY) "JumlahPresiden"
FROM PRESIDENT
GROUP BY PARTY
ORDER BY COUNT(PARTY) DESC;
GO --3
select PRES_NAME, BIRTH_YR, YRS_SERV
from PRESIDENT
where BIRTH_YR > 1881 and YRS_SERV > 5
order by DEATH_AGE asc;
GO --4
select STATE_NAME "StateBukanKelahiran"
from STATE
where STATE_NAME NOT in (select STATE_BORN from PRESIDENT);
GO --5
select STATE_BORN, COUNT(STATE_BORN) "TotalPresiden"
from PRESIDENT
group by STATE_BORN
having COUNT(STATE_BORN) > 1
order by COUNT(STATE_BORN) desc;
GO --6
select PRES_NAME
from PRES_HOBBY
where HOBBY = 'Riding' and PRES_NAME in (select PRES_NAME from PRES_MARRIAGE where NR_CHILDREN!=0);
----
SELECT DISTINCT PRES_HOBBY.PRES_NAME
FROM PRES_HOBBY INNER JOIN PRES_MARRIAGE
ON PRES_HOBBY.PRES_NAME = PRES_MARRIAGE.PRES_NAME
WHERE HOBBY = 'RIDING'
AND NR_CHILDREN > 0
GO --7
select PRES_NAME, (2021 - BIRTH_YR) "Usia"
from PRESIDENT
where DEATH_AGE is null and PRES_NAME in (select PRES_NAME from PRES_MARRIAGE where NR_CHILDREN!=0);
------
SELECT DISTINCT PRESIDENT.PRES_NAME, (2021-PRESIDENT.BIRTH_YR) AS usia
FROM PRESIDENT INNER JOIN PRES_MARRIAGE
ON PRESIDENT.PRES_NAME = PRES_MARRIAGE.PRES_NAME
WHERE PRES_MARRIAGE.NR_CHILDREN > 0
AND PRESIDENT.DEATH_AGE IS NULL
GO --8
select * from PRESIDENT
where DEATH_AGE = 66;
GO --9
select CANDIDATE, ELECTION_YEAR
from ELECTION
where ELECTION_YEAR = 1852 and WINNER_LOOSER_INDIC = 'W';
GO --10
select ELECTION_YEAR, VOTES "JlhVote"
from ELECTION
where VOTES > 450 and WINNER_LOOSER_INDIC = 'W';