const init = () => {
  const el = document.createElement('p');
  el.textContent = 'Hello, world!';
  document.body.appendChild(el);
};

document.addEventListener('DOMContentLoaded', init);