/*  -------------------------------- Atualiza o Texto da Opção Selecionada no Dropdown -------------------------------- */
$('.dropdown-menu').on('click', 'a', function () {
  var text = $(this).html();
  var htmlText = text + ' <i class="fa-solid fa-caret-down fa-fade"></i>';
  $(this).closest('.dropdown').find('#dropdown-btn').html(htmlText);
});

/* ----------------------------------------------- Links da Navbar ---------------------------------------------------- */
// Função para adicionar a classe .active ao link do menu correto
function setActiveLink() {
  const currentPage = window.location.pathname; // Obtém o caminho da página atual

  // Remove a classe .active de todos os links do menu
  const links = document.querySelectorAll('.navbar-nav li a');
  links.forEach((link) => {
    link.classList.remove('active');
  });

  // Adiciona a classe .active ao link correspondente à página atual
  if (currentPage.includes('index.html')) {
    document.querySelector('.navbar-nav li a[href="index.html"]').classList.add('active');
  } else if (currentPage.includes('destinos.html')) {
    document.querySelector('.navbar-nav li a[href="destinos.html"]').classList.add('active');
  } else if (currentPage.includes('promocoes.html')) {
    document.querySelector('.navbar-nav li a[href="promocoes.html"]').classList.add('active');
  }
}

// Chama a função para definir o link ativo na página carregada
setActiveLink();

/* -------------------------------- Escurece o fundo quando o menu hamburguer é aberto -------------------------------- */
document.addEventListener('DOMContentLoaded', function () {
  var navbarToggler = document.querySelector('.navbar-toggler');
  var overlay = document.getElementById('overlay');

  navbarToggler.addEventListener('click', function () {
    // Desabilita o botão do menu hamburguer durante a transição
    navbarToggler.setAttribute('disabled', 'disabled');

    if (overlay.style.opacity !== '1') {
      overlay.style.opacity = '1';
      overlay.style.visibility = 'visible';
    } else {
      overlay.style.opacity = '0';
      overlay.style.visibility = 'hidden';
    }

    // Habilita o botão do menu hamburguer após a transição
    setTimeout(function () {
      navbarToggler.removeAttribute('disabled');
    }, 500); // Ajuste este valor para a duração da transição
  });
});

/* ------------------------------ Funções Para Abrir e Fechar o Formulário de Contato ------------------------------ */
// Constantes padrões
const msg_sec = document.querySelector('.msg_sec');

// Constantes do login/cadastro
const msgOpenBtn = document.querySelector('#msg-open');
const msgCloseBtn = document.querySelector('.msg_close');

// Abre e fecha o formulário de login e cadastro
msgOpenBtn.addEventListener('click', (e) => {
  e.preventDefault();
  msg_sec.classList.add('show');
});

// Fecha o formulário de login/cadastro quando o botão de fechar é clicado
msgCloseBtn.addEventListener('click', () => {
  msg_sec.classList.remove('show');
});

/* --------------------------------- Funções para abrir e fechar o formulário de login -------------------------------- */
// Constantes padrões
const home = document.querySelector('.home');

// Constantes do login/cadastro
const formOpenBtn = document.querySelector('#form-open');
const formContainer = document.querySelector('.form_container');
const formCloseBtn = document.querySelector('.form_close');
const signupBtn = document.querySelector('#signup');
const loginBtn = document.querySelector('#login');
const pwShowHide = document.querySelectorAll('.pw_hide');

// Abre e fecha o formulário de login e cadastro
formOpenBtn.addEventListener('click', () => {
  home.classList.add('show');
});

// Fecha o formulário de login/cadastro
formCloseBtn.addEventListener('click', () => {
  home.classList.remove('show');
});

// Troca o ícone de mostrar e ocultar senha
pwShowHide.forEach((icon) => {
  icon.addEventListener('click', () => {
    let getPwInput = icon.parentElement.querySelector('input');
    if (getPwInput.type === 'password') {
      getPwInput.type = 'text';
      icon.classList.replace('fa-eye-slash', 'fa-eye');
    } else {
      getPwInput.type = 'password';
      icon.classList.replace('fa-eye', 'fa-eye-slash');
    }
  });
});

/* Permite a troca entre o formulário de login e cadastro */
signupBtn.addEventListener('click', (e) => {
  e.preventDefault();
  formContainer.classList.add('active');
});
loginBtn.addEventListener('click', (e) => {
  e.preventDefault();
  formContainer.classList.remove('active');
});