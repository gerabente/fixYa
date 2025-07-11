PGDMP  9                    }            fixya    17.5    17.5 B               0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                           false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                           false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                           false                       1262    18181    fixya    DATABASE     {   CREATE DATABASE fixya WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Spanish_Paraguay.1252';
    DROP DATABASE fixya;
                  
   fixYaAdmin    false            �            1259    18204    clientes    TABLE     \   CREATE TABLE public.clientes (
    persona_id integer NOT NULL,
    dni integer NOT NULL
);
    DROP TABLE public.clientes;
       public         heap r    
   fixYaAdmin    false            �            1259    18280    trabajos    TABLE     �   CREATE TABLE public.trabajos (
    id integer NOT NULL,
    orden_id integer NOT NULL,
    descripcion text NOT NULL,
    costo numeric(12,2) NOT NULL,
    fecha_creacion timestamp without time zone DEFAULT CURRENT_TIMESTAMP
);
    DROP TABLE public.trabajos;
       public         heap r    
   fixYaAdmin    false            �            1259    18279    detalle_id_seq    SEQUENCE     �   CREATE SEQUENCE public.detalle_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 %   DROP SEQUENCE public.detalle_id_seq;
       public            
   fixYaAdmin    false    230                       0    0    detalle_id_seq    SEQUENCE OWNED BY     B   ALTER SEQUENCE public.detalle_id_seq OWNED BY public.trabajos.id;
          public            
   fixYaAdmin    false    229            �            1259    18244    estado    TABLE     c   CREATE TABLE public.estado (
    id integer NOT NULL,
    nombre character varying(50) NOT NULL
);
    DROP TABLE public.estado;
       public         heap r    
   fixYaAdmin    false            �            1259    18243    estado_id_seq    SEQUENCE     �   CREATE SEQUENCE public.estado_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 $   DROP SEQUENCE public.estado_id_seq;
       public            
   fixYaAdmin    false    226                       0    0    estado_id_seq    SEQUENCE OWNED BY     ?   ALTER SEQUENCE public.estado_id_seq OWNED BY public.estado.id;
          public            
   fixYaAdmin    false    225            �            1259    18251    ordenes    TABLE     �   CREATE TABLE public.ordenes (
    id integer NOT NULL,
    vehiculo_id integer NOT NULL,
    estado_id integer NOT NULL,
    fecha_creacion timestamp without time zone DEFAULT CURRENT_TIMESTAMP,
    fecha_cierre timestamp without time zone
);
    DROP TABLE public.ordenes;
       public         heap r    
   fixYaAdmin    false            �            1259    18250    orden_id_seq    SEQUENCE     �   CREATE SEQUENCE public.orden_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 #   DROP SEQUENCE public.orden_id_seq;
       public            
   fixYaAdmin    false    228                       0    0    orden_id_seq    SEQUENCE OWNED BY     ?   ALTER SEQUENCE public.orden_id_seq OWNED BY public.ordenes.id;
          public            
   fixYaAdmin    false    227            �            1259    18183    personas    TABLE     .  CREATE TABLE public.personas (
    id integer NOT NULL,
    nombre character varying(100) NOT NULL,
    apellido character varying(100) NOT NULL,
    correo character varying(150) NOT NULL,
    telefono character varying(50),
    fecha_creacion timestamp without time zone DEFAULT CURRENT_TIMESTAMP
);
    DROP TABLE public.personas;
       public         heap r    
   fixYaAdmin    false            �            1259    18182    persona_id_seq    SEQUENCE     �   CREATE SEQUENCE public.persona_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 %   DROP SEQUENCE public.persona_id_seq;
       public            
   fixYaAdmin    false    218                       0    0    persona_id_seq    SEQUENCE OWNED BY     B   ALTER SEQUENCE public.persona_id_seq OWNED BY public.personas.id;
          public            
   fixYaAdmin    false    217            �            1259    18192    usuarios    TABLE     �   CREATE TABLE public.usuarios (
    persona_id integer NOT NULL,
    nombre_usuario character varying(50) NOT NULL,
    contrasena_hash character varying(60) NOT NULL,
    last_login timestamp without time zone
);
    DROP TABLE public.usuarios;
       public         heap r    
   fixYaAdmin    false            �            1259    18228 	   vehiculos    TABLE     f  CREATE TABLE public.vehiculos (
    id integer NOT NULL,
    cliente_id integer NOT NULL,
    chapa character varying(20) NOT NULL,
    fabricante character varying(100),
    modelo character varying(100),
    anio integer,
    fecha_registro timestamp without time zone DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT vehiculo_anio_check CHECK ((anio > 1900))
);
    DROP TABLE public.vehiculos;
       public         heap r    
   fixYaAdmin    false            �            1259    18227    vehiculo_id_seq    SEQUENCE     �   CREATE SEQUENCE public.vehiculo_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 &   DROP SEQUENCE public.vehiculo_id_seq;
       public            
   fixYaAdmin    false    224                       0    0    vehiculo_id_seq    SEQUENCE OWNED BY     D   ALTER SEQUENCE public.vehiculo_id_seq OWNED BY public.vehiculos.id;
          public            
   fixYaAdmin    false    223            �            1259    18215    visitas    TABLE     �   CREATE TABLE public.visitas (
    id integer NOT NULL,
    cliente_id integer NOT NULL,
    fecha timestamp without time zone DEFAULT CURRENT_TIMESTAMP NOT NULL
);
    DROP TABLE public.visitas;
       public         heap r    
   fixYaAdmin    false            �            1259    18214    visita_id_seq    SEQUENCE     �   CREATE SEQUENCE public.visita_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 $   DROP SEQUENCE public.visita_id_seq;
       public            
   fixYaAdmin    false    222                       0    0    visita_id_seq    SEQUENCE OWNED BY     @   ALTER SEQUENCE public.visita_id_seq OWNED BY public.visitas.id;
          public            
   fixYaAdmin    false    221            H           2604    18247 	   estado id    DEFAULT     f   ALTER TABLE ONLY public.estado ALTER COLUMN id SET DEFAULT nextval('public.estado_id_seq'::regclass);
 8   ALTER TABLE public.estado ALTER COLUMN id DROP DEFAULT;
       public            
   fixYaAdmin    false    225    226    226            I           2604    18254 
   ordenes id    DEFAULT     f   ALTER TABLE ONLY public.ordenes ALTER COLUMN id SET DEFAULT nextval('public.orden_id_seq'::regclass);
 9   ALTER TABLE public.ordenes ALTER COLUMN id DROP DEFAULT;
       public            
   fixYaAdmin    false    227    228    228            B           2604    18186    personas id    DEFAULT     i   ALTER TABLE ONLY public.personas ALTER COLUMN id SET DEFAULT nextval('public.persona_id_seq'::regclass);
 :   ALTER TABLE public.personas ALTER COLUMN id DROP DEFAULT;
       public            
   fixYaAdmin    false    217    218    218            K           2604    18283    trabajos id    DEFAULT     i   ALTER TABLE ONLY public.trabajos ALTER COLUMN id SET DEFAULT nextval('public.detalle_id_seq'::regclass);
 :   ALTER TABLE public.trabajos ALTER COLUMN id DROP DEFAULT;
       public            
   fixYaAdmin    false    230    229    230            F           2604    18231    vehiculos id    DEFAULT     k   ALTER TABLE ONLY public.vehiculos ALTER COLUMN id SET DEFAULT nextval('public.vehiculo_id_seq'::regclass);
 ;   ALTER TABLE public.vehiculos ALTER COLUMN id DROP DEFAULT;
       public            
   fixYaAdmin    false    223    224    224            D           2604    18218 
   visitas id    DEFAULT     g   ALTER TABLE ONLY public.visitas ALTER COLUMN id SET DEFAULT nextval('public.visita_id_seq'::regclass);
 9   ALTER TABLE public.visitas ALTER COLUMN id DROP DEFAULT;
       public            
   fixYaAdmin    false    221    222    222                      0    18204    clientes 
   TABLE DATA           3   COPY public.clientes (persona_id, dni) FROM stdin;
    public            
   fixYaAdmin    false    220   �L       	          0    18244    estado 
   TABLE DATA           ,   COPY public.estado (id, nombre) FROM stdin;
    public            
   fixYaAdmin    false    226   �L                 0    18251    ordenes 
   TABLE DATA           [   COPY public.ordenes (id, vehiculo_id, estado_id, fecha_creacion, fecha_cierre) FROM stdin;
    public            
   fixYaAdmin    false    228   �L                 0    18183    personas 
   TABLE DATA           Z   COPY public.personas (id, nombre, apellido, correo, telefono, fecha_creacion) FROM stdin;
    public            
   fixYaAdmin    false    218   M                 0    18280    trabajos 
   TABLE DATA           T   COPY public.trabajos (id, orden_id, descripcion, costo, fecha_creacion) FROM stdin;
    public            
   fixYaAdmin    false    230   #M                 0    18192    usuarios 
   TABLE DATA           [   COPY public.usuarios (persona_id, nombre_usuario, contrasena_hash, last_login) FROM stdin;
    public            
   fixYaAdmin    false    219   @M                 0    18228 	   vehiculos 
   TABLE DATA           d   COPY public.vehiculos (id, cliente_id, chapa, fabricante, modelo, anio, fecha_registro) FROM stdin;
    public            
   fixYaAdmin    false    224   ]M                 0    18215    visitas 
   TABLE DATA           8   COPY public.visitas (id, cliente_id, fecha) FROM stdin;
    public            
   fixYaAdmin    false    222   zM                  0    0    detalle_id_seq    SEQUENCE SET     =   SELECT pg_catalog.setval('public.detalle_id_seq', 1, false);
          public            
   fixYaAdmin    false    229                       0    0    estado_id_seq    SEQUENCE SET     ;   SELECT pg_catalog.setval('public.estado_id_seq', 3, true);
          public            
   fixYaAdmin    false    225                       0    0    orden_id_seq    SEQUENCE SET     ;   SELECT pg_catalog.setval('public.orden_id_seq', 1, false);
          public            
   fixYaAdmin    false    227                       0    0    persona_id_seq    SEQUENCE SET     =   SELECT pg_catalog.setval('public.persona_id_seq', 1, false);
          public            
   fixYaAdmin    false    217                       0    0    vehiculo_id_seq    SEQUENCE SET     >   SELECT pg_catalog.setval('public.vehiculo_id_seq', 1, false);
          public            
   fixYaAdmin    false    223                       0    0    visita_id_seq    SEQUENCE SET     <   SELECT pg_catalog.setval('public.visita_id_seq', 1, false);
          public            
   fixYaAdmin    false    221            W           2606    18208    clientes cliente_pkey 
   CONSTRAINT     [   ALTER TABLE ONLY public.clientes
    ADD CONSTRAINT cliente_pkey PRIMARY KEY (persona_id);
 ?   ALTER TABLE ONLY public.clientes DROP CONSTRAINT cliente_pkey;
       public              
   fixYaAdmin    false    220            g           2606    18288    trabajos detalle_pkey 
   CONSTRAINT     S   ALTER TABLE ONLY public.trabajos
    ADD CONSTRAINT detalle_pkey PRIMARY KEY (id);
 ?   ALTER TABLE ONLY public.trabajos DROP CONSTRAINT detalle_pkey;
       public              
   fixYaAdmin    false    230            a           2606    18249    estado estado_pkey 
   CONSTRAINT     P   ALTER TABLE ONLY public.estado
    ADD CONSTRAINT estado_pkey PRIMARY KEY (id);
 <   ALTER TABLE ONLY public.estado DROP CONSTRAINT estado_pkey;
       public              
   fixYaAdmin    false    226            e           2606    18258    ordenes orden_pkey 
   CONSTRAINT     P   ALTER TABLE ONLY public.ordenes
    ADD CONSTRAINT orden_pkey PRIMARY KEY (id);
 <   ALTER TABLE ONLY public.ordenes DROP CONSTRAINT orden_pkey;
       public              
   fixYaAdmin    false    228            O           2606    18191    personas persona_email_key 
   CONSTRAINT     W   ALTER TABLE ONLY public.personas
    ADD CONSTRAINT persona_email_key UNIQUE (correo);
 D   ALTER TABLE ONLY public.personas DROP CONSTRAINT persona_email_key;
       public              
   fixYaAdmin    false    218            Q           2606    18189    personas persona_pkey 
   CONSTRAINT     S   ALTER TABLE ONLY public.personas
    ADD CONSTRAINT persona_pkey PRIMARY KEY (id);
 ?   ALTER TABLE ONLY public.personas DROP CONSTRAINT persona_pkey;
       public              
   fixYaAdmin    false    218            S           2606    18196    usuarios usuario_pkey 
   CONSTRAINT     [   ALTER TABLE ONLY public.usuarios
    ADD CONSTRAINT usuario_pkey PRIMARY KEY (persona_id);
 ?   ALTER TABLE ONLY public.usuarios DROP CONSTRAINT usuario_pkey;
       public              
   fixYaAdmin    false    219            U           2606    18198    usuarios usuario_username_key 
   CONSTRAINT     b   ALTER TABLE ONLY public.usuarios
    ADD CONSTRAINT usuario_username_key UNIQUE (nombre_usuario);
 G   ALTER TABLE ONLY public.usuarios DROP CONSTRAINT usuario_username_key;
       public              
   fixYaAdmin    false    219            ]           2606    18237    vehiculos vehiculo_chapa_key 
   CONSTRAINT     X   ALTER TABLE ONLY public.vehiculos
    ADD CONSTRAINT vehiculo_chapa_key UNIQUE (chapa);
 F   ALTER TABLE ONLY public.vehiculos DROP CONSTRAINT vehiculo_chapa_key;
       public              
   fixYaAdmin    false    224            _           2606    18235    vehiculos vehiculo_pkey 
   CONSTRAINT     U   ALTER TABLE ONLY public.vehiculos
    ADD CONSTRAINT vehiculo_pkey PRIMARY KEY (id);
 A   ALTER TABLE ONLY public.vehiculos DROP CONSTRAINT vehiculo_pkey;
       public              
   fixYaAdmin    false    224            Z           2606    18221    visitas visita_pkey 
   CONSTRAINT     Q   ALTER TABLE ONLY public.visitas
    ADD CONSTRAINT visita_pkey PRIMARY KEY (id);
 =   ALTER TABLE ONLY public.visitas DROP CONSTRAINT visita_pkey;
       public              
   fixYaAdmin    false    222            b           1259    18294    idx_orden_estado    INDEX     I   CREATE INDEX idx_orden_estado ON public.ordenes USING btree (estado_id);
 $   DROP INDEX public.idx_orden_estado;
       public              
   fixYaAdmin    false    228            c           1259    18295    idx_orden_vehiculo    INDEX     M   CREATE INDEX idx_orden_vehiculo ON public.ordenes USING btree (vehiculo_id);
 &   DROP INDEX public.idx_orden_vehiculo;
       public              
   fixYaAdmin    false    228            [           1259    18297    idx_vehiculo_cliente    INDEX     P   CREATE INDEX idx_vehiculo_cliente ON public.vehiculos USING btree (cliente_id);
 (   DROP INDEX public.idx_vehiculo_cliente;
       public              
   fixYaAdmin    false    224            X           1259    18298    idx_visita_cliente    INDEX     L   CREATE INDEX idx_visita_cliente ON public.visitas USING btree (cliente_id);
 &   DROP INDEX public.idx_visita_cliente;
       public              
   fixYaAdmin    false    222            i           2606    18209     clientes cliente_persona_id_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.clientes
    ADD CONSTRAINT cliente_persona_id_fkey FOREIGN KEY (persona_id) REFERENCES public.personas(id) ON DELETE CASCADE;
 J   ALTER TABLE ONLY public.clientes DROP CONSTRAINT cliente_persona_id_fkey;
       public            
   fixYaAdmin    false    4689    220    218            n           2606    18289    trabajos detalle_orden_id_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.trabajos
    ADD CONSTRAINT detalle_orden_id_fkey FOREIGN KEY (orden_id) REFERENCES public.ordenes(id) ON DELETE CASCADE;
 H   ALTER TABLE ONLY public.trabajos DROP CONSTRAINT detalle_orden_id_fkey;
       public            
   fixYaAdmin    false    228    230    4709            l           2606    18269    ordenes orden_estado_id_fkey    FK CONSTRAINT     ~   ALTER TABLE ONLY public.ordenes
    ADD CONSTRAINT orden_estado_id_fkey FOREIGN KEY (estado_id) REFERENCES public.estado(id);
 F   ALTER TABLE ONLY public.ordenes DROP CONSTRAINT orden_estado_id_fkey;
       public            
   fixYaAdmin    false    228    226    4705            m           2606    18259    ordenes orden_vehiculo_id_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.ordenes
    ADD CONSTRAINT orden_vehiculo_id_fkey FOREIGN KEY (vehiculo_id) REFERENCES public.vehiculos(id) ON DELETE RESTRICT;
 H   ALTER TABLE ONLY public.ordenes DROP CONSTRAINT orden_vehiculo_id_fkey;
       public            
   fixYaAdmin    false    4703    224    228            h           2606    18199     usuarios usuario_persona_id_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.usuarios
    ADD CONSTRAINT usuario_persona_id_fkey FOREIGN KEY (persona_id) REFERENCES public.personas(id) ON DELETE RESTRICT;
 J   ALTER TABLE ONLY public.usuarios DROP CONSTRAINT usuario_persona_id_fkey;
       public            
   fixYaAdmin    false    218    4689    219            k           2606    18238 "   vehiculos vehiculo_cliente_id_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.vehiculos
    ADD CONSTRAINT vehiculo_cliente_id_fkey FOREIGN KEY (cliente_id) REFERENCES public.clientes(persona_id) ON DELETE CASCADE;
 L   ALTER TABLE ONLY public.vehiculos DROP CONSTRAINT vehiculo_cliente_id_fkey;
       public            
   fixYaAdmin    false    4695    224    220            j           2606    18222    visitas visita_cliente_id_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.visitas
    ADD CONSTRAINT visita_cliente_id_fkey FOREIGN KEY (cliente_id) REFERENCES public.clientes(persona_id) ON DELETE CASCADE;
 H   ALTER TABLE ONLY public.visitas DROP CONSTRAINT visita_cliente_id_fkey;
       public            
   fixYaAdmin    false    4695    220    222                  x������ � �      	   ,   x�3�t-.H-J�2�(�ON-��2�I-���KLI����� Ǔ
H            x������ � �            x������ � �            x������ � �            x������ � �            x������ � �            x������ � �     