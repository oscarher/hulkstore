--
-- PostgreSQL database dump
--

-- Dumped from database version 11.4
-- Dumped by pg_dump version 11.4

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- Name: sq_pk_id_producto; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.sq_pk_id_producto
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.sq_pk_id_producto OWNER TO postgres;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- Name: producto; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.producto (
    pk_id_producto integer DEFAULT nextval('public.sq_pk_id_producto'::regclass) NOT NULL,
    nombre_producto character varying(45) NOT NULL,
    cantidad integer NOT NULL,
    fk_id_tipo integer NOT NULL
);


ALTER TABLE public.producto OWNER TO postgres;

--
-- Name: sq_pk_id_tipo_producto; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.sq_pk_id_tipo_producto
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.sq_pk_id_tipo_producto OWNER TO postgres;

--
-- Name: tipo_producto; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tipo_producto (
    pk_id_tipo integer DEFAULT nextval('public.sq_pk_id_tipo_producto'::regclass) NOT NULL,
    descripcion character varying(45) NOT NULL
);


ALTER TABLE public.tipo_producto OWNER TO postgres;

--
-- Data for Name: producto; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.producto (pk_id_producto, nombre_producto, cantidad, fk_id_tipo) FROM stdin;
\.


--
-- Data for Name: tipo_producto; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.tipo_producto (pk_id_tipo, descripcion) FROM stdin;
\.


--
-- Name: sq_pk_id_producto; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.sq_pk_id_producto', 3, true);


--
-- Name: sq_pk_id_tipo_producto; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.sq_pk_id_tipo_producto', 5, true);


--
-- Name: producto producto_pk_id; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.producto
    ADD CONSTRAINT producto_pk_id PRIMARY KEY (pk_id_producto);


--
-- Name: tipo_producto tipo_producto_pk_id; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tipo_producto
    ADD CONSTRAINT tipo_producto_pk_id PRIMARY KEY (pk_id_tipo);


--
-- Name: producto producto_fk_id_tipo_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.producto
    ADD CONSTRAINT producto_fk_id_tipo_fkey FOREIGN KEY (fk_id_tipo) REFERENCES public.tipo_producto(pk_id_tipo) ON DELETE RESTRICT;


--
-- PostgreSQL database dump complete
--

